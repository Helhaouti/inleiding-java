// Uitwerking van Praktijkopdracht

import java.applet.Applet;
import java.awt.*;

public class zPraktijkopdracht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        // Kollom 1
        g.drawLine(10, 10, 100, 10);
        g.drawString("Lijn", 50, 25);

        g.drawRect(10, 40, 90, 45);
        g.drawString("Rechthoek", 35, 100);

        g.drawRoundRect(10, 130, 90, 45, 30, 30);
        g.drawString("Afgeronde rechthoek", 0, 190);

        // Kollom 2
        g.setColor(Color.magenta);
        g.fillRect(125, 40, 90, 45);

        g.setColor(Color.black);
        g.drawOval(125, 40, 90, 45);
        g.drawString("Gevulde Rechthoek met ovaal", 125, 100);

        g.setColor(Color.magenta);
        g.fillOval(125, 130, 90, 45);

        g.setColor(Color.black);
        g.drawString("Afgeronde rechthoek", 125, 190);

        // Kollom 3
        g.setColor(Color.yellow);
        g.fillArc(250, 40, 90, 45, 0, 45);
        g.setColor(Color.black);
        g.drawOval(250, 40, 90, 45);
        g.drawString("Taarpunt met ovaal eromheen", 220, 115);

        g.drawOval(270, 130, 45, 45);
        g.drawString("Cirkel", 280, 190);
    }
}