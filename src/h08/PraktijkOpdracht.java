// Uitwerking van Praktijkopdracht
package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    /*declares textfields*/ TextField FactorEen, FactorTwee;

    /*declares buttons*/    Button Vermenigvuldig, Delen, Plus, Min;

    /*declares doubles*/    double FactorEenInhoud, FactorTweeInhoud, Resultaat;

    public void init() {
        /*Initializes textfields*/              FactorEen = new TextField();    FactorTwee = new TextField();

        /*Initializes buttons*/                 Vermenigvuldig = new Button("*");  Delen = new Button("/"); Plus = new Button("+"); Min = new Button("-");

        /*Adds actionlistener to the buttons*/  Vermenigvuldig.addActionListener (new VermenigvuldigListener());     Delen.addActionListener (new DelenListener());     Plus.addActionListener (new PlusListener());       Min.addActionListener (new MinListener());

        /*Adds textfields to the Applet*/       add(FactorEen);     add(FactorTwee);

        /*Adds buttons to the Applet*/          add(Vermenigvuldig);    add(Delen);     add(Plus);      add(Min);

        Resultaat = 0;
    }

    public void paint(Graphics g) {
        g.drawString("" + Resultaat, 20, 50);
    }


    private void getWaardesVanTekstvakken() {
        String A = FactorEen.getText();     FactorEenInhoud = Double.parseDouble(A);
        String B = FactorTwee.getText();    FactorTweeInhoud = Double.parseDouble(B);
    }


    class VermenigvuldigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getWaardesVanTekstvakken();
            Resultaat = FactorEenInhoud * FactorTweeInhoud;
            repaint();
        }
    }

    class DelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getWaardesVanTekstvakken();
            Resultaat = FactorEenInhoud / FactorTweeInhoud;
            repaint();
        }
    }

    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getWaardesVanTekstvakken();
            Resultaat = FactorEenInhoud + FactorTweeInhoud;
            repaint();
        }
    }

    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getWaardesVanTekstvakken();
            Resultaat = FactorEenInhoud - FactorTweeInhoud;
            repaint();
        }
    }
}
