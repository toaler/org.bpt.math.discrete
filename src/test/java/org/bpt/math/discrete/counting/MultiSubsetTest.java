package org.bpt.math.discrete.counting;

import java.math.BigInteger;

import junit.framework.TestCase;

public class MultiSubsetTest extends TestCase{

	public void testCompute() {
		assertEquals(BigInteger.valueOf(1330), MultiSubset.compute(4, 18));
	}
}
