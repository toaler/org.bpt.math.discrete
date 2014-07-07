package org.bpt.math.discrete.counting;

import junit.framework.TestCase;

public class SequenceTest extends TestCase {

	public void testPermutationWithRepetition() {
		assertEquals(1000, Sequence.permutationWithRepetition(10, 3));
	}

	public void testPermutationWithRepetitionIllegalThings() {
		try {
			assertEquals(1000, Sequence.permutationWithRepetition(0, 3));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testPermutationWithRepetitionIllegalChoice() {
		try {
			assertEquals(1000, Sequence.permutationWithRepetition(3, 0));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
		
		try {
			assertEquals(1000, Sequence.permutationWithRepetition(3, 4));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}

	public void testPermutationWithoutRepetition() {
		assertEquals(3360, Sequence.permutationWithoutRepetition(16, 3));
	}
	
	public void testPermutationWithoutRepetitionIllegalThings() {
		try {
			assertEquals(1000, Sequence.permutationWithoutRepetition(0, 3));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testPermutationWithoutRepetitionIllegalChoice() {
		try {
			assertEquals(1000, Sequence.permutationWithoutRepetition(3, 0));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
		
		try {
			assertEquals(1000, Sequence.permutationWithoutRepetition(3, 4));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
}
