package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AchtPuntDrie extends Applet {
    TextField ExBtwBedrag;
    Label LabelExBtwBedrag;

    Button KnopOk;

    Double IncBTW;


    public void init() {
        KnopOk = new Button("Ok");
        ExBtwBedrag = new TextField();
        LabelExBtwBedrag = new Label("Typ hier het bedrag zonder btw: ");

        KnopOk.addActionListener(new BelastingCalculator());
        ExBtwBedrag.addActionListener(new BelastingCalculator());

        IncBTW = 0.0;

        add(LabelExBtwBedrag);
        add(ExBtwBedrag);
        add(KnopOk);
    }

    public void paint(Graphics g) {
        g.drawString("Het bedrag inclusief BTW (21 %) is: " + IncBTW, 20, 50);

    }

    class BelastingCalculator implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = ExBtwBedrag.getText();
            Double ExBTW = Double.parseDouble(A);

            IncBTW = ExBTW * 1.21;
            repaint();
        }
    }
}