// uitwerking van 6.1

import java.applet.Applet;
import java.awt.*;

public class ZesPuntEen extends Applet {
    int EarnedMoney;
    int AmountDividedByFour;
    int AfstandVanZijkant;

    public void init() {
        EarnedMoney = 113;
        AmountDividedByFour = EarnedMoney / 4;
        AfstandVanZijkant = 20;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt             € " + AmountDividedByFour, AfstandVanZijkant, 50);
        g.drawString("Ali krijgt               € " + AmountDividedByFour, AfstandVanZijkant, 65);
        g.drawString("Jeannette krijgt € " + AmountDividedByFour, AfstandVanZijkant, 80);
        g.drawString("Hamza krjgt       € " + AmountDividedByFour , AfstandVanZijkant, 95);
    }
}