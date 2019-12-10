package h13;

import java.awt.*;
import java.applet.*;

public class Twee extends Applet {

    public void init () {
        setSize(1920,1080);
    }

    public void paint(Graphics g) {

        // use a ratio of 3:1 (width : height) for best result.
        tekenmuur(g,45,15,100,1500);
    }

    private void tekenmuur (Graphics g, int width, int height, int Rows, int column){
        g.setColor(Color.getHSBColor(30,100,50));

        int counter, counterRows = 0;
        int x1 = width * 2, y1 = height * 2;

        for (counter = 0; counter < column; counter++) {
            g.fillRect( x1, y1, width, height);

            x1 += width + 5;

            if (counter == column - 1) {
                if (counterRows != Rows) {
                    counterRows++;
                    counter = 0;
                    x1 = width * 2;
                    y1 += height + 5;
                } if (counterRows == Rows) {

                }
            }
        }
    }
}