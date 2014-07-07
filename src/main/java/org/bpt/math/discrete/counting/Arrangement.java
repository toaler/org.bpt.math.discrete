package org.bpt.math.discrete.counting;

import java.math.BigInteger;

public class Arrangement {
	/**
	 * Computes the permutation of a sequence with without repetition. Given
	 * {@code n} possibilities, choose {@code k} unique outcomes. In other words,
	 * there are {@code n} possibilities for the first choice, and there are {@code n - 1}
	 * possibilities for the second choice, and so on, multiplying each time.
	 * 
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return returns the permutation with repetition
	 */
	public static BigInteger compute(int n, int k) {
		if (n <= 0 || k <= 0 || n < k) {
			throw new IllegalArgumentException();
		}

		return Util.factorial(n).divide(Util.factorial(n - k));
	}
}
