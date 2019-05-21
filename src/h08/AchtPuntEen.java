// Uitwerking van 8.1

package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AchtPuntEen extends Applet {
    Button OkKnop;
    Button ResetKnop;

    TextField TekstVak;
    Label LabelTekstVak;

    String Schermtekst;

    public void init() {

        LabelTekstVak = new Label("Typ iets in.");
        TekstVak = new TextField("");

        OkKnop = new Button("Ok");
        ResetKnop = new Button("Reset");

        TekstVak.addActionListener(new OkKnopListener());
        OkKnop.addActionListener(new OkKnopListener());
        ResetKnop.addActionListener(new ResetKnopListener());


        add(TekstVak);
        add(LabelTekstVak);
        add(ResetKnop);
        add(OkKnop);
    }

    public void paint(Graphics g) {
        g.drawString(Schermtekst, 50, 60);
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Schermtekst = TekstVak.getText();
            repaint();
        }
    }

    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Schermtekst = "";
            repaint();
        }
    }
}