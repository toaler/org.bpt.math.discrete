package org.bpt.math.discrete.counting;

public class Util {
	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}

		long result = 1L;
		for (int i = n; i > 0; i--) {
			result *= i;
		}
	
		return result;
	}

}
