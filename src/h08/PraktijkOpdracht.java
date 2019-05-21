package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    TextField FactorEen;
    TextField FactorTwee;

    Button Vermenigvuldig;
    Button Delen;
    Button Plus;
    Button Min;

    double FactorEenInhoud;
    double FactorTweeInhoud;
    double Resultaat;


    public void init() {
        FactorEen = new TextField();
        FactorTwee = new TextField();

        Vermenigvuldig = new Button("*");
        Delen = new Button("/");
        Plus = new Button("+");
        Min = new Button("-");


        Vermenigvuldig.addActionListener(new VermenigvuldigListener());
        Delen.addActionListener(new DelenListener());
        Plus.addActionListener(new PlusListener());
        Min.addActionListener(new MinListener());

        add(FactorEen);
        add(FactorTwee);

        add(Vermenigvuldig);
        add(Delen);
        add(Plus);
        add(Min);

        Resultaat = 0;

    }

    public void paint(Graphics g) {
        g.drawString("" + Resultaat, 20, 50);
    }


    private void getWaardesVanTekstvakken() {
        String A = FactorEen.getText();
        FactorEenInhoud = Double.parseDouble(A);

        String B = FactorTwee.getText();
        FactorTweeInhoud = Double.parseDouble(B);
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
