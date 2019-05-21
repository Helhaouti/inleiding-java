// Uitwerking van 10.1
package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntEen extends Applet {
    TextField tekstvak;
    Label label;

    Double hoogsteGetal;
    Double ingetyptGetal;

    public void init() {
        tekstvak = new TextField();
        label = new Label("Voer getal in.");

        tekstvak.addActionListener(new tekstvaklistener());

        hoogsteGetal = 0.0;
        ingetyptGetal = 0.0;

        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal dat heeft ingetypt is: " + hoogsteGetal, 20, 50);
    }

    private void PakWaardesVanTekstvak() {
        String A = tekstvak.getText();
        ingetyptGetal = Double.parseDouble(A);
    }

    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesVanTekstvak();
            if (ingetyptGetal > hoogsteGetal) {
                hoogsteGetal = ingetyptGetal;
                repaint();
            }
        }
    }
}
