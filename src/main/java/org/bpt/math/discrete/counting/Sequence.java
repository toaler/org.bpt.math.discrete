package org.bpt.math.discrete.counting;

import java.math.BigInteger;

public class Sequence {

	/**
	 * Computes the permutation of a sequence with repetition. Given {code
	 * n} possibilities, choose {@code k} outcomes, potentially recurring. In
	 * other words, there are {@code n} possibilities for the first choice, and there
	 * are {@code n - 1} possibilities for the second choice, and so on, multiplying each
	 * time.
	 * 
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return returns the permutation with repetition
	 */
	public static BigInteger compute(int n, int k) {
		if (n <= 0 || k <= 0) {
			throw new IllegalArgumentException();
		}
		return BigInteger.valueOf(n).pow(k);
	}
}
