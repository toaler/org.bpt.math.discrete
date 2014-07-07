package org.bpt.math.discrete.counting;

import java.math.BigInteger;

import junit.framework.TestCase;

public class SubsetTest extends TestCase {
	public void testCombination() {
		assertEquals(BigInteger.valueOf(10), Subset.compute(5, 2));
	}
	
	public void testCombinationZeroChooseZero() {
		assertEquals(BigInteger.ONE, Subset.compute(0, 0));
	}
	
	public void testCombinationOneChooseZero() {
		assertEquals(BigInteger.ONE, Subset.compute(1, 0));
	}
	
	public void testCombinationZeroChooseOne() {
		assertEquals(BigInteger.ZERO, Subset.compute(0, 1));
	}
	
	public void testCombinationZeroChooseNegativeOne() {
		assertEquals(BigInteger.ZERO, Subset.compute(0, -1));
	}

	
	public void testCombination2() {
		assertEquals(BigInteger.valueOf(1140), Subset.compute(20, 3));
	}
	
	public void testCombination3() {
		assertEquals(BigInteger.valueOf(1330), Subset.compute(21, 18));
	}
}
