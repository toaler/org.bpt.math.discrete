package org.bpt.math.discrete.counting;

import junit.framework.TestCase;

public class SubsetTest extends TestCase {
	public void testCombination() {
		assertEquals(10, Subset.compute(5, 2));
	}
	
	public void testCombinationZeroChooseZero() {
		assertEquals(1, Subset.compute(0, 0));
	}
	
	public void testCombinationOneChooseZero() {
		assertEquals(1, Subset.compute(1, 0));
	}
	
	public void testCombinationZeroChooseOne() {
		assertEquals(0, Subset.compute(0, 1));
	}
	
	public void testCombinationZeroChooseNegativeOne() {
		assertEquals(0, Subset.compute(0, -1));
	}

	
	public void testCombination2() {
		assertEquals(1140, Subset.compute(20, 3));
	}
}
