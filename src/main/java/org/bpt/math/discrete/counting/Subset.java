package org.bpt.math.discrete.counting;

import java.math.BigInteger;

public class Subset {
	/**
	 * @param n - possibilities
	 * @param k - outcomes
	 * @return Returns the number of ways of picking {@code k} unordered outcomes, from {@code n} redundant possibilities
	 */
	public static BigInteger compute(int nInt, int kInt) {
		BigInteger n = BigInteger.valueOf(nInt);
		BigInteger k = BigInteger.valueOf(kInt);
		
		if (n.equals(BigInteger.ZERO) && k.equals(BigInteger.ZERO))
			return BigInteger.ONE;

		if (n.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		

		return Util.factorial(n).divide((Util.factorial(k).multiply(Util.factorial(n.subtract(k)))));
	}
}