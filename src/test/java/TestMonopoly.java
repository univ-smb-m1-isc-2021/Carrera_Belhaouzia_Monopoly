package test.java;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.java.Monopoly;

public class TestMonopoly extends TestCase{
	public TestMonopoly(String name) {
		super(name);
	}

	public void test() {
		Monopoly m = new Monopoly();
	    System.out.println("Test monopoly : ");
	    m.enregistrerJoueur("zohir");
	    m.enregistrerJoueur("thomas");
	    assertTrue(m.l.size() == 2);
	    assertTrue(m.lancerPartie().equals(m.l.get(0)));
	    assertTrue(m.finisTour().equals(m.l.get(1)));
	    assertTrue(m.finisTour().equals(m.l.get(0)));
	    
	}
}
