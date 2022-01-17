package test.java;

import org.junit.jupiter.api.Test;


import junit.framework.TestCase;
import main.java.CasePropriete;
import main.java.Joueur;
import main.java.Quartier;
import main.java.Constructible;

public class TestEtat  extends TestCase{


    @Test
    public void test() {
        Joueur j = new Joueur("Thomas Le BG du 74");
        Quartier q4 = new Quartier("Orange",1);
        CasePropriete c = new CasePropriete("Avenue de Mozart",180, 250,q4);
        Constructible e = new Constructible(c);

        System.out.println("Test Etat : ");




        j.avancer(c);
        System.out.println(j.current);
        assertTrue(j.current.equals(c));
        j.acheterCase();
        assertTrue(c.estConstructible(j));
        assertTrue(c.etat.estConstructible());
        int old = j.argent;
        e.atterirJoueur(j);
        assertTrue(j.argent==old);


    }

}