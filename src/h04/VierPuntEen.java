//Uitwerking van 4.1
package h04;

import java.applet.Applet;
import java.awt.*;

public class VierPuntEen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(60, 20, 80, 50);
        g.drawLine(60, 20, 40, 50);
        g.drawLine(40, 50, 80, 50);
    }
}