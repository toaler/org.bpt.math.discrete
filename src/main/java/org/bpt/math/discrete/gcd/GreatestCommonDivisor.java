package org.bpt.math.discrete.gcd;

import java.math.BigInteger;

public class GreatestCommonDivisor {

	/**
	 * @param a
	 * @param b
	 * @return computes the greatest common divisor between two {@code long}'s {@code a} and {@code b}
	 */
	public static long compute(long a, long b) {
		while (!(a == 0) && !(b == 0)) {
			long tmp = a % b;
			a = b;
			b = tmp;
		}
		return a + b;
	}

	/**
	 * @param a
	 * @param b
	 * @return computes the greatest common divisor between two {@link BigInteger}'s {@code a} and {@code b}
	 */
	public static BigInteger compute(BigInteger a, BigInteger b) {
		while (!a.equals(BigInteger.ZERO) && !b.equals(BigInteger.ZERO)) {
			BigInteger tmp = a.mod(b);
			a = b;
			b = tmp;
		}
		return a.add(b);
	}

}
