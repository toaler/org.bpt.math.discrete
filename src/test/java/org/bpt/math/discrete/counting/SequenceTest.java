package org.bpt.math.discrete.counting;

import java.math.BigInteger;

import junit.framework.TestCase;

public class SequenceTest extends TestCase {

	public void testPermutationWithRepetition() {
		assertEquals(BigInteger.valueOf(1000), Sequence.compute(10, 3));
	}
	
	public void testPermutationWithRepetitionBig() {
		assertEquals(new BigInteger("18446744073709551616"), Sequence.compute(2, 64));
	}

	public void testPermutationWithRepetitionIllegalThings() {
		try {
			assertEquals(BigInteger.valueOf(1000), Sequence.compute(0, 3));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testPermutationWithRepetitionIllegalChoice() {
		try {
			assertEquals(BigInteger.valueOf(1000), Sequence.compute(3, 0));
			fail();
		} catch (IllegalArgumentException e) {
			// success
		} catch (Exception e) {
			fail();
		}
	}
}
