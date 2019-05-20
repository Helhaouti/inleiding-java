// uitwerking van 6.2

package h06;

import java.awt.*;
import java.applet.*;

public class ZesPuntTwee extends Applet {
    int uur;
    int dag;
    int RegulierJaar;
    int SchrikkeJaar;

    int AfstandX;

    public void init () {
        uur = 60 /*minuten*/ * 60 /*seconden*/;
        dag = uur * 24 /*uur*/;
        RegulierJaar = dag * 365;
        SchrikkeJaar = dag * 366;

        AfstandX = 20;
    }

    public void paint (Graphics g) {
        g.drawString("Aantal seconden in een uur: " + uur, AfstandX, 50);
        g.drawString("Aantal seconden in een dag: " + dag, AfstandX, 65);
        g.drawString("Aantal seconden in een normaaljaar : " + RegulierJaar, AfstandX, 80);
        g.drawString("Aantal seconden in een schrikkeljaar: " + SchrikkeJaar, AfstandX, 95);
    }
}
