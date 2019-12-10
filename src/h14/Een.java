package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Een extends Applet {
    Boolean klik;
    Button knop;
    String randomk;
    String randomkl;
    String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "koninging", "koning", "aas"};
    String[] kleuren = {"Klaver", "Schoppen", "Harten", "Ruiten"};

    public void init() {
        knop = new Button("Deel kaarten");
        add(knop);
        klik = false;
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klik = true;
                int random = new Random().nextInt(kaarten.length);
                randomk = (kaarten[random]);
                int random1 = new Random().nextInt(kleuren.length);
                randomkl = (kleuren[random1]);
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        if (klik == true) {
            g.drawString("" + randomkl + " " + randomk, 50, 60);
        }
    }
}