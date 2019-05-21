// Uitwerking van 8.2

package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AchtPuntTwee extends Applet {
    // Delaration Buttons
    Button KnopMannen;
    Button KnopPotMannen;
    Button KnopVrouwen;
    Button KnopPotVrouwn;

    // Declaration of string amount visitors by gender
    int Mannen;
    int PotMannen;
    int Vrouwen;
    int PotVrouwn;
    int Totaal;

    // locatie van stings
    int AfstandX;
    int RegelEen;
    int RegelTwee;
    int RegelDrie;
    int RegelVier;
    int RegelVijf;


    public void init() {
// Initializing buttons
        KnopMannen = new Button("Man");
        KnopPotMannen = new Button("Potentiële man");
        KnopVrouwen = new Button("Vrouwen");
        KnopPotVrouwn = new Button("Potentiële vrouwen");

// Adds an eventlistener
        KnopMannen.addActionListener(new KnopMannenListener());
        KnopPotMannen.addActionListener(new KnopPotMannenListener());
        KnopVrouwen.addActionListener(new KnopVrouwenListener());
        KnopPotVrouwn.addActionListener(new KnopPotVrouwnListener());

// Ads the buttons to the Applet
        add(KnopMannen);
        add(KnopPotMannen);
        add(KnopVrouwen);
        add(KnopPotVrouwn);

// Declaration of the value of an integer
        Mannen = 0;
        PotMannen = 0;
        Vrouwen = 0;
        PotVrouwn = 0;
        Totaal = 0;

// location of G.drawSting
        AfstandX = 20;

        RegelEen = 50;
        RegelTwee = 65;
        RegelDrie = 80;
        RegelVier = 95;
        RegelVijf = 135;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal Mannelijke bezoekers: " + Mannen, AfstandX, RegelEen);
        g.drawString("Potentiële mannelijke bezoekers: " + PotMannen, AfstandX, RegelTwee);
        g.drawString("Aantal vrouwelijke bezoekers: " + Vrouwen, AfstandX, RegelDrie);
        g.drawString("Potentiële Vrouwelijke bezoekers: " + PotVrouwn, AfstandX, RegelVier);

        g.drawString("Totale bezoekers: " + Totaal, AfstandX, RegelVijf);
    }


    class KnopMannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Mannen++;
            Totaal = Mannen + PotMannen + Vrouwen + PotVrouwn;
            repaint();
        }
    }

    class KnopPotMannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotMannen++;
            Totaal = Mannen + PotMannen + Vrouwen + PotVrouwn;
            repaint();
        }
    }

    class KnopVrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vrouwen++;
            Totaal = Mannen + PotMannen + Vrouwen + PotVrouwn;
            repaint();
        }
    }

    class KnopPotVrouwnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotVrouwn++;
            Totaal = Mannen + PotMannen + Vrouwen + PotVrouwn;
            repaint();
        }
    }
}