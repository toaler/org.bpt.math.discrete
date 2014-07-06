package org.bpt.math.discrete.counting;

public class Sequence {

	/**
	 * Computes the permutation of a sequence with repetition. Given {code
	 * things} things, choose {@code choose} items, potentially recurring. In
	 * other words, there are n possibilities for the first choice, and there
	 * are n possibilities for the second choice, and so on, multiplying each
	 * time.
	 * 
	 * @param things
	 * @param choose
	 * @return returns the permutation with repetition
	 */
	public static long permutationWithRepetition(int things, int choose) {
		if (things <= 0 || choose <= 0 || things < choose) {
			throw new IllegalArgumentException();
		}
		return (long) Math.pow(things, choose);
	}

	/**
	 * Computes the permutation of a sequence with without repetition. Given
	 * {code things} things, choose {@code choose} unique items. In other words,
	 * there are n possibilities for the first choice, and there are n - 1
	 * possibilities for the second choice, and so on, multiplying each time.
	 * 
	 * @param things
	 * @param choose
	 * @return returns the permutation with repetition
	 */
	public static long permutationWithoutRepetition(int things, int choose) {
		if (things <= 0 || choose <= 0 || things < choose) {
			throw new IllegalArgumentException();
		}

		return factorial(things) / factorial(things - choose);
	}

	private static long factorial(int n) {
		long result = 1L;
		for (int i = n; i > 0; i--) {
			result *= i;
		}

		return result;
	}
}
