package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.URL;

public class Twee extends Applet {
    Boolean klik;

    Button knop;

    boolean stateKeeper = false;

    int tellerSupreme;

    private URL pad;
    private AudioClip sound;


    public void init() {
        setSize(1920,1080);

        knop = new Button("Deel kaarten"); knop.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { stateKeeper = true; repaint(); }});

        add(knop);

        klik = false;

        pad = Twee.class.getResource("/h14//resources/");
        sound = getAudioClip(pad, "applaus.wav");
    }

    public void paint (Graphics g) {

        if (stateKeeper) {
            g.drawString("Speler 1", 5,100);
            g.drawString("Speler 2", 105,100);
            g.drawString("Speler 3", 205,100);
            g.drawString("Speler 4", 305,100);

            int teller;
            int x1 = 5, y1 = 140;
            tellerSupreme = 1;

            String[] deck = {"Klaver tien", "Harten negen", "Klaver heer", "Schoppen tien", "Harten vijf", "Harten tien", "Harten zeven", "Harten vrouw", "Ruiten boer", "Schoppen twee", "Klaver twee", "Klaver aas", "Schoppen aas", "Schoppen zes", "Ruiten vier", "Harten vier", "Ruiten aas", "Klaver vrouw", "Schoppen vrouw", "Ruiten twee", "Schoppen heer", "Ruiten acht", "Harten zes", "Ruiten vrouw", "Schoppen zeven", "Harten drie", "Ruiten vijf", "Klaver acht", "Schoppen vijf", "Ruiten zeven", "Ruiten tien", "Ruiten heer", "Klaver zeven", "Harten twee", "Schoppen negen", "Schoppen drie", "Schoppen acht", "Schoppen vier", "Schoppen boer", "Ruiten zes", "Klaver vijf", "Harten heer", "Ruiten negen", "Klaver boer", "Klaver zes", "Harten acht", "Ruiten drie", "Harten aas", "Harten boer", "Klaver drie", "Klaver negen", "Klaver vier"};

            for (teller = 1; teller <= 13 && tellerSupreme <= 52 ; teller++) {
                g.drawString("" + deelKaart(deck), x1, y1);
                y1 += 20;
                tellerSupreme++;
                if (tellerSupreme == 52) { sound.play(); }

                if (teller == 13) {
                    y1 = 140;
                    x1 += 100;
                    teller = 0;
                }
            }
        }
    }

    private String deelKaart (String[] deck) {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }
}