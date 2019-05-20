// Uitwerking van 4.4
package h04;

import java.applet.*;
import java.awt.*;

public class VierPuntVier extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Vallerie", 0, 50); // Tekst voor staaf Vallerie
        g.drawString("Jeroen", 0, 130);   // Tekst voor staaf Jeroen
        g.drawString("Hans", 0, 200);     // Tekst voor staaf Hans

        g.setColor(Color.yellow);                          // Kleur geel van eerste staaf in de diagram
        g.fillRect(55, 20, 80, 60);    // Eerste staaf in de diagram vallerie

        g.setColor(Color.blue);                            // Kleur blauw van eerste staaf in de diagram
        g.fillRect(55, 90, 200, 60);     // Tweede staaf in de diagram Jeroen

        g.setColor(Color.green);                            // Kleur groen van eerste staaf in de diagram
        g.fillRect(55, 160, 160, 60);      // derde staaf in de diagram Hans
    }
}