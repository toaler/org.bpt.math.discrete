package org.bpt.math.discrete.counting;

import java.math.BigInteger;

import junit.framework.TestCase;

public class UtilTest extends TestCase {

	public void testFactorial() {
		assertEquals(BigInteger.valueOf(24), Util.factorial(4));
	}
	
	public void testBigFactorial() {
		assertEquals(new BigInteger("265252859812191058636308480000000"), Util.factorial(30));
	}

	public void testFactorialZero() {
		assertEquals(BigInteger.ONE, Util.factorial(0));
	}

	public void testFactorialNegative() {
		try {
			assertEquals(1, Util.factorial(-1));
			fail();
		} catch (IllegalArgumentException e) {
		} catch (Exception e) {
			fail();
		}
	}

}
