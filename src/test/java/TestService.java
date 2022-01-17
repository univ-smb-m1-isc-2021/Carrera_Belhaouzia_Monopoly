package test.java;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.java.Service;

public class TestService extends TestCase{
	
	public TestService(String name) {
		super(name);
	}
	
	@Test
	public void test() {
		Service s = new Service("TEST",0,0,null);
		int i = s.lancerdeService();
		System.out.println("random :  "+i);
		assertTrue( true);
	}
}
