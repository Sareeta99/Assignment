package junitexample;

import static org.junit.Assert.*;

public class Test {

	@Test(timeout=1000)
	public void test1() {
	System.out.println("Inside the test1");
	try {
	Thread.sleep(2000);
	}
	catch(Exception e) {
	System.out.println(e);
	}
	}
	
	}


