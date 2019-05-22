// Uitwerking van Praktijkopdracht
package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label labelVanTekstvak;
    Button okKnop;

    int vorigIngetyptGetal;
    int ingetyptGetal;

    int afstandX;
    int afstandY;
    int factorEen;
    int factorTwee;
    int Resultaat;

    int teller;
    int teller2;
    int click;


    public void init() {
        tekstvak = new TextField();
        labelVanTekstvak = new Label("Typ hiernaast de tafel die u wilt.");
        tekstvak.addActionListener(new Buttonlistener());

        okKnop = new Button("Ok");
        okKnop.addActionListener(new Buttonlistener());

        add(labelVanTekstvak);
        add(tekstvak);
        add(okKnop);
        click = 0;
    }

    private void PakWaardesUitTekstVak() {
        String A = tekstvak.getText();
        ingetyptGetal = Integer.parseInt(A);
    }

    public void paint(Graphics g) {
        afstandX = 20;
        afstandY = 50;

        factorEen = 1;

        if (click == 1) {
            for (teller = 0; teller < 10; teller++) {
                afstandY += 15;
                Resultaat = factorEen * factorTwee;
                g.drawString("" + factorEen + " x " + factorTwee + " =  " + Resultaat, 20, afstandY);
                factorEen++;
                vorigIngetyptGetal = ingetyptGetal;
            }
        }
        if (click == 2) {
            factorTwee = 1;
            for (teller2 = 0; teller2 < 10; teller2++) {
                for (teller = 0; teller < 10; teller++) {
                    afstandY += 15;
                    Resultaat = factorEen * factorTwee;
                    g.drawString("" + factorEen + " x " + factorTwee + " =  " + Resultaat, afstandX, afstandY);
                    factorEen++;
                }

                factorTwee++;
                teller = 0;
                afstandX += 80;
                afstandY = 50;
                factorEen = 1;
            }
        }
    }

    class Buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesUitTekstVak();
            if (click > 2 || vorigIngetyptGetal != ingetyptGetal) {
                click = 0;
            }
            click++;

            if (click == 1) {
                teller = 0;
                factorTwee = ingetyptGetal;
                repaint();
            }

            if (click == 2) {
                teller2 = 0;
                factorTwee = 1;
                repaint();
            }
        }
    }
}