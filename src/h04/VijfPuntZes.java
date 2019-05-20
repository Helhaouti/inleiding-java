// Uitwerking van 4.6

import java.applet.Applet;
import java.awt.*;

public class VijfPuntZes extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.black);
        g.fillRoundRect(50, 50, 60, 175, 50, 50);

        g.fillRect(65, 215, 30, 100);

        g.setColor(Color.red);
        g.fillOval(55, 55, 50, 50);

        g.setColor(Color.yellow);
        g.fillOval(55, 110, 50, 50);

        g.setColor(Color.green);
        g.fillOval(55, 165, 50, 50);
    }
}