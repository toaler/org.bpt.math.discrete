package org.bpt.math.discrete.counting;

import java.math.BigInteger;

public class Util {
	public static BigInteger factorial(int n) {
		return factorial(BigInteger.valueOf(n));
	}

	public static BigInteger factorial(BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) < 0) {
			throw new IllegalArgumentException();
		}

		BigInteger result = BigInteger.ONE;
		for (int i = (int) n.longValue(); i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
	
		return result;
	}

}
