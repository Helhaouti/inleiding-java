// Uitwerking van 5.1

import java.applet.Applet;
import java.awt.*;

public class AVijfPuntEen extends Applet {
    //Kleur
    Color OpvulKleur;
    Color LijnKleur;

    int HoogteVanVak;       // Hoogte
    int BreedteVanVak;      // Breedte

    int LocKollomEenX;      // Locatie kollom 1
    int LocKollomTweeX;     // Locatie kollom 2
    int LocKollomDrieX;     // Locatie kollom 3

    int RijEen;     // Locatie van rij 1
    int RijTwee;    // Locatie van rij 2
    int RijDrie;    // Locatie van rij 3

    // Locatie van tekst Beschrijving
    // X as
    int KollomEenTekstEenX;
    int KollomTweeTekstEenX;
    int KollomDrieTekstEenX;

    // Y as
    int TekstEenY;
    int TekstTweeY;
    int TekstDrieY;

    // Helft van Breedtevak
    int HelftBreedtevak;

    public void init() {
        HelftBreedtevak = BreedteVanVak / 2;

        HoogteVanVak = 300;  // Waarde van variable Hoogte
        BreedteVanVak = 600; // Waarde van variable Breedte

        OpvulKleur = Color.magenta;
        LijnKleur = Color.black;

        // Waarde van variable Kollommen
        LocKollomEenX = 10;
        LocKollomTweeX = LocKollomEenX + BreedteVanVak + 10;
        LocKollomDrieX = LocKollomTweeX + BreedteVanVak + 10;

        // Waarde van variabele Rijen
        RijEen = 10;
        RijTwee = 40;
        RijDrie = RijTwee + HoogteVanVak + 30;

        // Locatie van tekst Beschrijving
        // X as
        KollomEenTekstEenX = LocKollomEenX + HelftBreedtevak;
        KollomTweeTekstEenX = LocKollomTweeX + HelftBreedtevak;
        KollomDrieTekstEenX = LocKollomDrieX + HelftBreedtevak;

        // Y as
        TekstEenY = RijEen + 15;
        TekstTweeY = RijTwee + HoogteVanVak + 15;
        TekstDrieY = RijDrie + HoogteVanVak + 15;
    }

    public void paint(Graphics g) {
        // Kollom 1
        g.drawLine(LocKollomEenX, RijEen, BreedteVanVak + LocKollomEenX, RijEen);
        g.drawString("Lijn", KollomEenTekstEenX + HelftBreedtevak, TekstEenY);

        g.drawRect(LocKollomEenX, RijTwee, BreedteVanVak, HoogteVanVak);
        g.drawString("Rechthoek", KollomEenTekstEenX, TekstTweeY);

        g.drawRoundRect(LocKollomEenX, RijDrie, BreedteVanVak, HoogteVanVak, 30, 30);
        g.drawString("Afgeronde rechthoek", KollomEenTekstEenX, TekstDrieY);


        // Kollom 2
        g.setColor(OpvulKleur);
        g.fillRect(LocKollomTweeX, RijTwee, BreedteVanVak, HoogteVanVak);

        g.setColor(LijnKleur);
        g.drawOval(LocKollomTweeX, RijTwee, BreedteVanVak, HoogteVanVak);
        g.drawString("Gevulde Rechthoek met ovaal", KollomTweeTekstEenX, TekstTweeY);

        g.setColor(OpvulKleur);
        g.fillOval(LocKollomTweeX, RijDrie, BreedteVanVak, HoogteVanVak);

        g.setColor(LijnKleur);
        g.drawString("Afgeronde rechthoek", KollomTweeTekstEenX, TekstDrieY);


        // Kollom 3
        g.setColor(Color.yellow);
        g.fillArc(LocKollomDrieX, RijTwee, BreedteVanVak, HoogteVanVak, 0, 45);
        g.setColor(LijnKleur);
        g.drawOval(LocKollomDrieX, RijTwee, BreedteVanVak, HoogteVanVak);
        g.drawString("Taarpunt met ovaal eromheen", KollomDrieTekstEenX, TekstTweeY);

        g.drawOval(LocKollomDrieX, RijDrie, BreedteVanVak, HoogteVanVak);
        g.drawString("Cirkel", KollomDrieTekstEenX, TekstDrieY);
    }
}