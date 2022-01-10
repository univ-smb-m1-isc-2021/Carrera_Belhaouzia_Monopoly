package test.java;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.java.Plateau;

public class TestPlateau extends TestCase{
	public TestPlateau(String name) {
		super(name);
	}
	@Test
	public void test() {
		Plateau p = new Plateau();
	    System.out.println("Test plateau : ");
	    assertTrue(p.passerdepart(34, 0) == true);
	    assertTrue(p.passerdepart(12,24) == false);
	    assertTrue(p.passerdepart(23, 12) == true);
	    
	}
}
