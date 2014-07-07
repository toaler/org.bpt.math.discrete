package org.bpt.math.discrete.counting;

public class Subset {

	/**
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return Returns the number of ways of picking {@code k} unordered outcomes from {@code n} possibilities 
	 */
	public static long compute(int n, int k) {
		if (n == 0 && k == 0)
			return 1;

		if (n == 0)
			return 0L;

		return Util.factorial(n)
				/ (Util.factorial(k) * Util.factorial(n - k));
	}
}