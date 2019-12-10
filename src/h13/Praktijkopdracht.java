// Uitwerking van Praktijkopdracht h13
package h13;

import java.applet.Applet;
import java.awt.*;

//2. Gebruik de methode uit opdracht 1 om een boomgaard te tekenen
// die uit tenminste 2 rijen van minimaal 5 bomen bestaat.

public class Praktijkopdracht extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        tekenboomen(g,125,125,100,75,50,125,100,100);
    }

    void tekenboomen (Graphics g,int xr, int yr, int xc, int yc, int wijdter, int hoogter, int wijdtec, int hoogtec){
        g.setColor(Color.orange);
        g.fillRect(xr,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc,yc,wijdtec,hoogtec);
    }
}