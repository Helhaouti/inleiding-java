// Uitwerking van 4.7

import java.applet.Applet;
import java.awt.*;

public class VierPuntZeven extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        g.setColor(Color.white);
        g.fillRoundRect(50, 50, 190, 190, 50, 50);

        g.setColor(Color.black);
        g.fillOval(75, 75, 65, 65);
        g.fillOval(150, 75, 65, 65);
        g.fillOval(75, 150, 65, 65);
        g.fillOval(150, 150, 65, 65);
    }
}
