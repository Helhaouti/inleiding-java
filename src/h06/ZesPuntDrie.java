// uitwerking van 6.3

package h06;

import java.applet.*;
import java.awt.*;

public class ZesPuntDrie extends Applet {
    int A, B;
    double C;

    public void init () {
        A = 2000000000;
        B = 2000000000;
        C = A + B;
    }

    public void paint (Graphics g) {
        g.drawString("A + B = " + C, 20, 20);
    }
}