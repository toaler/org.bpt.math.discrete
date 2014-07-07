package org.bpt.math.discrete.counting;

import junit.framework.TestCase;

public class UtilTest extends TestCase {

	public void testFactorial() {
		assertEquals(24, Util.factorial(4));
	}

	public void testFactorialZero() {
		assertEquals(1, Util.factorial(0));
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
