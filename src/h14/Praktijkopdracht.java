package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {

    TextField numberInput;
    Button knop, resetKnop;
    Label infotekst;
    int input, aantal, eigenZet, status;
    Image emoji;
    URL pad;

    double r;

    public void init() {
        setSize(1280,720);
        status = 0;
        aantal = 23;

        infotekst = new Label("Hoeveel munten neem je (één, twee of drie)?");
        numberInput = new TextField();
        knop = new Button("OK");
        resetKnop = new Button("Reset");

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = numberInput.getText(); input = Integer.parseInt(s);

                r = Math.random(); eigenZet = (int)(r * 3 + 1);

                if (input == 1 || input == 2 || input == 3) {
                    aantal -= input;

                    if (aantal == 1) {
                        //Player win
                            aantal = aantal - 1;
                            status = 1;
                            repaint();
                    } else if (aantal <= 0) {
                        //Player lose
                            aantal = aantal - 1;
                            status = 2;
                            repaint();
                    } else if (aantal == 4) { aantal -= 3;
                    } else if (aantal == 3) { aantal -= 2;
                    } else if (aantal == 2) { aantal -= 1;
                    } else {
                        aantal -= eigenZet;
                    }
                }
                else {
                    status = 3;
                }
                repaint();
            }
        });

        resetKnop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameResetter();
                repaint();
            }
        });

        pad = Praktijkopdracht.class.getResource("/h14//resources/");
        emoji = getImage(pad, "emotionless.png");


        add(infotekst);
        add(numberInput);
        add(knop);
        add(resetKnop);
    }

    private void gameResetter() {
        aantal = 23;
        status = 0;
    }

    public void paint(Graphics g) {
        int x = 180, y = 60;
        int xImage = 180, yImage = 80;

        if (status == 0) {
            // game play
            g.drawString("Aantal: " + aantal, x, y);

            for (int i = 0; i < aantal; i++) {
                    g.drawImage(emoji, xImage , yImage,this);
                    xImage += 50;

                if (xImage == 380) {
                    xImage = 180; yImage += 50;
                }
                }

        }   else if (status == 1) {
            // win
                g.drawString("Je hebt gewonnen", 50, 70);

        }   else if (status == 2) {
            // loss
                g.drawString("Je hebt verloren", 50, 70);

        }   else if (status == 3) {
            // Error
                g.drawString("Foute Invoer", 50,70);
        }
    }
}