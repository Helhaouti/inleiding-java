package h13;

import java.applet.*;
import java.awt.*;

public class Een extends Applet {

    public void init () {    }

    private void tekenDriehoek ( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        /*
        1 = linksonderin
        2 = boven
        3 = rechtsonderim
        */
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x1, y1, x3, y3);
    }

    public void paint (Graphics g) {
        tekenDriehoek(g , 50,150,100,50,150,150);
    }
}