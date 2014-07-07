package org.bpt.math.discrete.counting;

import junit.framework.TestCase;

public class ArrangementTest extends TestCase {
	public void testPermutationWithoutRepetition() {
		assertEquals(3360, Arrangement.compute(16, 3));
	}
	
	public void testPermutationWithoutRepetitionIllegalThings() {
		try {
			assertEquals(1000, Arrangement.compute(0, 3));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testPermutationWithoutRepetitionIllegalChoice() {
		try {
			assertEquals(1000, Arrangement.compute(3, 0));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
		
		try {
			assertEquals(1000, Arrangement.compute(3, 4));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
}
