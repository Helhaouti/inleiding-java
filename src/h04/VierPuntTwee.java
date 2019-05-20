// Uitwerking 4.2
package h04;

import java.applet.Applet;
import java.awt.*;

public class VierPuntTwee extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);  // Zet Achtergrondskleur op blauw.

        g.setColor(Color.yellow);   // Zet kleur van lijn op geel.

        // 3 g.drawLine gebruikt om een driehoek te vormen
        // Dak van het huis.
        g.drawLine(60, 20, 80, 50);
        g.drawLine(60, 20, 40, 50);
        g.drawLine(40, 50, 80, 50);

        g.drawRect(40, 50, 40, 50);     // Buitenste vierkant dat onderkant van het huis vormt.

        g.drawRect(45, 55, 15, 15);     // Raam.
        g.drawRect(60, 80, 15, 20);     // Deur.
    }
}