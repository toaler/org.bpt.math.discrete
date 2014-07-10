package org.bpt.math.discrete.gcd;

import java.math.BigInteger;

import junit.framework.TestCase;

public class GreatestCommonDivisorTest extends TestCase {

	public void testGreatestCommonDivisorLong() {
		assertEquals(6L, GreatestCommonDivisor.compute(12, 30));
	}
	
	public void testGreatestCommonDivisorBigInteger() {
		assertEquals(BigInteger.valueOf(6), GreatestCommonDivisor.compute(BigInteger.valueOf(12), BigInteger.valueOf(30)));
	}
}
