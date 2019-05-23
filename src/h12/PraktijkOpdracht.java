// Uitwerking van Praktijkopdracht
package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    int afstandX, afstandY;

    Label labelVanTekstvakVoorNamen, labelVanTekstvakVoorTelefoonnummers;     TextField tekstvakVoorNamen, tekstvakVoorTelefoonnummers;      Button okKnop;

    String ingetyptenamen;           int ingetyptTelefoonnummer;

    String[] inhoudTekstvakNamen;   int[] inhoudTekstvakTelefoonnummer;

    int hoeveelsteClickOpOkKnopMetGelijkNummer, tellerVanClickEen, tellerVanClickTwee, tellerArrayConverter;

    public void init() {
        setSize(500, 300);

        labelVanTekstvakVoorNamen           = new Label("Typ hiernaast de naam.");           tekstvakVoorNamen           = new TextField(25); tekstvakVoorNamen.addActionListener          ( new Buttonlistener() );
        labelVanTekstvakVoorTelefoonnummers = new Label("Typ hiernaast uw telefoonnummer."); tekstvakVoorTelefoonnummers = new TextField(25); tekstvakVoorTelefoonnummers.addActionListener( new Buttonlistener() );

        okKnop = new Button("Ok");      okKnop.addActionListener(new Buttonlistener());

        inhoudTekstvakNamen = new String[10];        inhoudTekstvakTelefoonnummer = new int[10];

        add(labelVanTekstvakVoorNamen);                add(tekstvakVoorNamen);
        add(labelVanTekstvakVoorTelefoonnummers);      add(tekstvakVoorTelefoonnummers);   add(okKnop);

        hoeveelsteClickOpOkKnopMetGelijkNummer = 0; tellerArrayConverter = 0;
    }

    private void PakWaardesUitTekstVak() {
        String A  = tekstvakVoorTelefoonnummers.getText();   ingetyptTelefoonnummer = Integer.parseInt(A);
        String B  = tekstvakVoorNamen.getText();              ingetyptenamen = B;
    }

    public void paint(Graphics g) {
        afstandX = 20;
        g.drawString("Typ hieronder uw naam en telefoonnummer.",20,0);

        if (hoeveelsteClickOpOkKnopMetGelijkNummer == 10) {
            for (tellerVanClickTwee = 0; tellerVanClickTwee < 10; tellerVanClickTwee++) {
                afstandY = 80;
                for (tellerVanClickEen = 0; tellerVanClickEen < 10; tellerVanClickEen++) {
                    afstandX = 20;
                    afstandY += 15;
                    g.drawString("" + ingetyptenamen, afstandX, afstandY);
                }

                afstandY = 80;
                for (tellerVanClickEen = 0; tellerVanClickEen < 10; tellerVanClickEen++) {
                    afstandX = 200;
                    afstandY += 15;
                    g.drawString("" + ingetyptTelefoonnummer, afstandX, afstandY);
                }

                tellerVanClickEen = 0;
                afstandX += 80;
                afstandY = 50;
            }
        }
    }

    class Buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesUitTekstVak();
            inhoudTekstvakNamen             [tellerArrayConverter] = ingetyptenamen;
            inhoudTekstvakTelefoonnummer    [tellerArrayConverter] = ingetyptTelefoonnummer;

            tellerArrayConverter++;


            if (hoeveelsteClickOpOkKnopMetGelijkNummer > 10) { hoeveelsteClickOpOkKnopMetGelijkNummer = 0; }

            hoeveelsteClickOpOkKnopMetGelijkNummer++;

            if (hoeveelsteClickOpOkKnopMetGelijkNummer == 10) { repaint(); tellerArrayConverter = 0; }
        }
    }
}