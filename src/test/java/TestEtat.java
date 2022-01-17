package test.java;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.java.CasePropriete;
import main.java.Joueur;
import main.java.Quartier;

public class TestEtat  extends TestCase{
	
	public TestEtat(String name) {
		super(name);
	}
	

	public void test() {
		Joueur j = new Joueur("Thomas Le BG du 74");
    	Quartier q4 = new Quartier("Orange",1);
		CasePropriete c = new CasePropriete("Avenue de Mozart",180, 250,q4);
	    System.out.println("Test joueur : ");
	    
	    j.avancer(c);
	    System.out.println(j.current);
	    assertTrue(j.current.equals(c));
	    j.acheterCase();
	    assertTrue(c.estConstructible(j));
	}

}
