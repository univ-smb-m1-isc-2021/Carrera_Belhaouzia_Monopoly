package test.java;


import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


public
class JUnitTest extends TestCase{

	public JUnitTest(String name) {
		super(name);
	}

	public void test() {
	    System.out.println("simpleTest");
	    assertTrue(true);
	}

}
