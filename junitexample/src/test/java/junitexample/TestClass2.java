package junitexample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestClass2 {
	
	@Test
	@Ignore
	public void test4() {
	System.out.println("Inside the test4");
	}
	
	@Test(expected= NullPointerException.class)
	public void test5() {
	System.out.println("Inside the test5");
	int a=10/2;
	String str = null;
	str.equals("hello");
	}
	

}
