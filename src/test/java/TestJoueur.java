package test.java;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.java.CasePropriete;
import main.java.Joueur;

public class TestJoueur extends TestCase{	

	@Test
	public void test() {
		Joueur j = new Joueur("Zohir");
	    System.out.println("Test joueur : ");
	    j.debiterJoueur(500);
	    assertTrue(j.argent == 1000);
	    j.crediterJoueur(500);
	    assertTrue(j.argent == 1500);
	    int size = j.l.size();
	    j.ajouterCase(new CasePropriete("Boulevard de belleville",60, 100,null));
	    assertTrue(j.l.size() == size + 1);
	    assertTrue(j.l.get(0).nom.equals("Boulevard de belleville"));
	}

}
