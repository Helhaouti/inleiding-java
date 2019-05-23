// Uitwerking van Praktijkopdracht
package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    Label labelVanTekstvak;     TextField tekstvak;     Button okKnop;

    int afstandX, afstandY;

    int vorigIngetyptGetal, ingetyptGetal;

    int factorEen, factorTwee, resultaat;

    int hoeveelsteClickOpOkKnopMetGelijkNummer, tellerVanClickEen, tellerVanClickTwee;

    public void init() {
        labelVanTekstvak = new Label("Typ hiernaast de tafel die u wilt.");     tekstvak = new TextField();     tekstvak.addActionListener(new Buttonlistener());

        okKnop = new Button("Ok");      okKnop.addActionListener(new Buttonlistener());

        add(labelVanTekstvak);      add(tekstvak);      add(okKnop);
        hoeveelsteClickOpOkKnopMetGelijkNummer = 0;
    }

    private void PakWaardesUitTekstVak() {  String A = tekstvak.getText();   ingetyptGetal = Integer.parseInt(A); }

    public void paint(Graphics g) {
        afstandX = 20;  afstandY = 50;
        factorEen = 1;

        if (hoeveelsteClickOpOkKnopMetGelijkNummer == 1) {
            for (tellerVanClickEen = 0; tellerVanClickEen < 10; tellerVanClickEen++) {
                afstandY += 15;
                resultaat = factorEen * factorTwee;
                g.drawString("" + factorEen + " x " + factorTwee + " =  " + resultaat, 20, afstandY);
                factorEen++;
                vorigIngetyptGetal = ingetyptGetal;
            }
        }

        if (hoeveelsteClickOpOkKnopMetGelijkNummer == 2) {
            for (tellerVanClickTwee = 0; tellerVanClickTwee < 10; tellerVanClickTwee++) {
                for (tellerVanClickEen = 0; tellerVanClickEen < 10; tellerVanClickEen++) {
                    afstandY += 15;
                    resultaat = factorEen * factorTwee;
                    g.drawString("" + factorEen + " x " + factorTwee + " =  " + resultaat, afstandX, afstandY);
                    factorEen++;
                }

                factorTwee++;
                tellerVanClickEen = 0;
                afstandX += 80;
                afstandY = 50;
                factorEen = 1;
            }
        }
    }

    class Buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesUitTekstVak();

            if (hoeveelsteClickOpOkKnopMetGelijkNummer > 2 || ingetyptGetal != vorigIngetyptGetal) { hoeveelsteClickOpOkKnopMetGelijkNummer = 0; }
            hoeveelsteClickOpOkKnopMetGelijkNummer++;
            if (hoeveelsteClickOpOkKnopMetGelijkNummer == 1) {   factorTwee = ingetyptGetal;               repaint();  }
            if (hoeveelsteClickOpOkKnopMetGelijkNummer == 2) {   factorTwee = 1;  tellerVanClickTwee = 0;  repaint();  }
        }
    }
}