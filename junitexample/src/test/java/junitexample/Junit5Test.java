package junitexample;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Junit5Test {

	@Test
	@repeatedTest(5)
	void test() {
	System.out.println("inside the test");
	}

}
