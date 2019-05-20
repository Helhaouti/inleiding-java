// Uitwerking praktijkopdracht van hoofdstuk 6

package h06;

import java.awt.*;
import java.applet.*;

public class Zpraktijkopdracht extends Applet{
    double  Cijfer1, Cijfer2,Cijfer3;
    double  VarGemEen;
    int     VarGemTwee;
    double  VarGemDrie;

    int AfstandY, AfstandYEen;

    public void init () {
        AfstandY = 20;
        AfstandYEen = AfstandY + 30;

        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;

        VarGemEen   = (Cijfer1 + Cijfer2 + Cijfer3) / 3 * 10;
        VarGemTwee  = (int) VarGemEen;
        VarGemDrie  = (double) VarGemTwee / 10;

    }

    public void paint (Graphics g) {
        g.drawString("" + Cijfer1, 20, AfstandY);
        g.drawString("" + Cijfer2, 50, AfstandY);
        g.drawString("" + Cijfer3, 80, AfstandY);

        g.drawString("" + VarGemDrie, 20, AfstandYEen);



    }
}
