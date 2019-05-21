// Uitwerking van 10.5

package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TienPuntVijf extends Applet {
    TextField tekstvak;
    Label label;

    double ingetyptGetal;
    String voldoende;

    public void init() {
        tekstvak = new TextField();
        label = new Label("Voer getal in.");

        tekstvak.addActionListener(new tekstvaklistener());

        ingetyptGetal = 0.0;

        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString(voldoende, 20, 50);
    }

    private void PakWaardesVanTekstvak() {
        String A = tekstvak.getText();
        ingetyptGetal = Double.parseDouble(A);
    }

    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesVanTekstvak();
            if (ingetyptGetal >= 0 && ingetyptGetal <= 5) {
                voldoende = "Onvoldoende";
                repaint();
            }

            if (ingetyptGetal >= 6 && ingetyptGetal <= 10) {
                voldoende = "voldoende";
                repaint();
            }
        }
    }
}