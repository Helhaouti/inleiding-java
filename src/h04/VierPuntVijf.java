//Uitwerking van 4.5

import java.applet.Applet;
import java.awt.*;

public class VierPuntVijf extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(200, 200, 300, 300, 45, 270);
    }
}