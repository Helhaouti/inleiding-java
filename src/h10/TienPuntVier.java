// Uitwerking van 10.4

package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TienPuntVier extends Applet {
    TextField tekstvak;
    Label label;

    TextField tekstvakJaartal;
    Label tekstvakJaartalLabel;

    String tekst;
    int maand;
    int jaar;

    public void init() {
        tekstvak = new TextField("", 2);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());

        tekstvakJaartal = new TextField("", 4);
        tekstvakJaartalLabel = new Label("Type het jaartal en druk op enter");
        tekstvakJaartal.addActionListener(new TekstvakListener());

        tekst = "";

        add(tekstvakJaartalLabel);
        add(tekstvakJaartal);

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100);
    }

    private void PakWaardesVanTekstvak() {
        String A = tekstvak.getText();
        maand = Integer.parseInt(A);

        String B = tekstvakJaartal.getText();
        jaar = Integer.parseInt(B);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesVanTekstvak();
            switch (maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                            jaar % 400 == 0) {
                        tekst = "Februari heeft 29 dagen";
                    } else {
                        tekst = "Februari heeft 28 dagen";
                    }
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..! Voer een getal in tussen de 1 en 12";
                    break;
            }
            repaint();
        }
    }
}
