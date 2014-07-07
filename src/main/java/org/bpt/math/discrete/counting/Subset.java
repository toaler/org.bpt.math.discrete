package org.bpt.math.discrete.counting;

public class Subset {

	/**
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return Returns the number of ways of picking {@code k} unordered outcomes from {@code n} possibilities 
	 */
	public static long compute(int possibilities, int k) {
		if (possibilities == 0 && k == 0)
			return 1;

		if (possibilities == 0)
			return 0L;

		return Util.factorial(possibilities)
				/ (Util.factorial(k) * Util.factorial(possibilities - k));
	}
}
