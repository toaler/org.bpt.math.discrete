package org.bpt.math.discrete.counting;

import java.math.BigInteger;

public class MultiSubset {

	/**
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return Returns the number of ways of picking {@code k} unordered
	 *         outcomes, from {@code n} redundant possibilities
	 */
	public static BigInteger compute(int n, int k) {
		if (n == 0)
			return BigInteger.ZERO;

		return Subset.compute(n + k - 1, k);
	}
}
