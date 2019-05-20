// Uitwerking van 4.3
package h04;

import java.applet.Applet;
import java.awt.*;

public class VierPuntDrie extends Applet {

    private Graphics g;

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(40, 20, 40, 100);   //  Vlaggenpaal: Lijn van Linksboven naar Rechtsonderin

        g.setColor(Color.red);                      // Rode kleur van 1ste deel van vlag.
        g.fillRect(40, 20, 30, 9); // Eerste deel vlag.


        g.setColor(Color.white);                    // Witte kleur van 2de gedeelte van vlag.
        g.fillRect(40, 29, 30, 9); // Tweede deel vlag.

        g.setColor(Color.blue);                     // Blauwe kleur van 3de gedeelte van vlag.
        g.fillRect(40, 38, 30, 9); // Derde  deel vlag.
    }
}