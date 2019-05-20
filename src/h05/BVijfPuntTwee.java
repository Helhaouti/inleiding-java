// Uitwerking van 5.2
package h05;

import java.applet.*;
import java.awt.*;

public class BVijfPuntTwee extends Applet {
    int Jeroen;
    int Vallerie;
    int Hans;

    public void init() {
        // Gewichten van de drie kinderen.
        Jeroen = 100;
        Vallerie = 40;
        Hans = 80;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Vallerie", 0, 50); // Tekst voor staaf Vallerie
        g.drawString("Jeroen", 0, 130);   // Tekst voor staaf Jeroen
        g.drawString("Hans", 0, 200);     // Tekst voor staaf Hans

        g.setColor(Color.yellow);                        // Kleur geel van eerste staaf in de diagram
        g.fillRect(55, 20, Vallerie * 2, 60);    // Eerste staaf in de diagram vallerie

        g.setColor(Color.blue);                            // Kleur blauw van eerste staaf in de diagram
        g.fillRect(55, 90, Jeroen * 2, 60);     // Tweede staaf in de diagram Jeroen

        g.setColor(Color.green);                            // Kleur groen van eerste staaf in de diagram
        g.fillRect(55, 160, Hans * 2, 60);      // derde staaf in de diagram Hans
    }
}