// Uitwerking van 10.3

package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TienPuntDrie extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100);
    }

    private void PakWaardesVanTekstvak() {
        String A = tekstvak.getText();
        maand = Integer.parseInt(A);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PakWaardesVanTekstvak();
            switch (maand) {
                case 1:
                    tekst = "Januari heeft 31";
                    break;
                case 2:
                    tekst = "Februari heeft 28 (in een schrikkeljaar 29)";
                    break;
                case 3:
                    tekst = "Maart heeft 31";
                    break;
                case 4:
                    tekst = "April heeft 30";
                    break;
                case 5:
                    tekst = "Mei heeft 31";
                    break;
                case 6:
                    tekst = "Juni heeft 30";
                    break;
                case 7:
                    tekst = "Juli heeft 31";
                    break;
                case 8:
                    tekst = "Augustus heeft 31";
                    break;
                case 9:
                    tekst = "September heeft 30";
                    break;
                case 10:
                    tekst = "Oktober heeft 31";
                    break;
                case 11:
                    tekst = "November heeft 30";
                    break;
                case 12:
                    tekst = "December heeft 31";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..! Voer een getal in tussen de 1 en 12";
                    break;
            }
            repaint();
        }
    }
}