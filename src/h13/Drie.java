package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Drie extends Applet {

Button bettonblokken;
Label labelBettonblokken;

Button bakstenen;
Label labelBakstenen;

int statekeeper; // 0 == do nothing; 1 == Wall of regular Bricks; 2 == Wall of concrete bricks;

    public void init () {
        setSize(1920,1080);

        bettonblokken = new Button();
        labelBettonblokken = new Label("Klik hier voor muur van Beton");
        bettonblokken.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statekeeper = 2;
                repaint();
            }
        });

        bakstenen = new Button();
        labelBakstenen = new Label("Klik hier voor muur van Bakstenen");
        bakstenen.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statekeeper = 1;
                repaint();
            }
        });

        add(labelBettonblokken); add(bettonblokken);
        add(labelBakstenen);     add(bakstenen);
    }

    public void paint(Graphics g) {
        // use a ratio of 3:1 (width : height) for best bricks.
        switch (statekeeper ) {
            case 0:
                break;
            case 1:
                g.setColor(Color.getHSBColor(30,100,50));
                tekenmuur(g,45,15,30,40);
                break;
            case 2:
                g.setColor(Color.gray);
                tekenmuur(g,90,30,15,20);
                break;
        }
    }

    private void tekenmuur (Graphics g, int width, int height, int Rows, int column){
        int counter, counterRows = 0;
        int x1 = 5, y1 = 50;

        for (counter = 1; counter <= column; counter++) {
            g.fillRect( x1, y1, width, height);

            x1 += width + 2;

            if (counter == column) {
                if (counterRows != Rows) {
                    counterRows++;
                    counter = 0;
                    x1 = 5;
                    y1 += height + 2;
                }

                if (counterRows == Rows) {  }
            }
        }
    }
}