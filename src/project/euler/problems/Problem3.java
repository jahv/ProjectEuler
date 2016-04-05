package project.euler.problems;

import project.euler.problems.utils.Utils;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?

 * @author jose.hernandez
 *
 */
public class Problem3 {

	/**
	 * Solve problem
	 * 
	 * @param number
	 * @return
	 */
	public static Long solve(final Long number) {
		return largestPrimeFactor(number);
	}

	/**
	 * Get largest prime factor of number.
	 * for loop starts in number - 1, due to we are looking the largest
	 * additionally, loop decrement is in 2, because does not matter even numbers
	 * since we are looking for primes, and even are never primes
	 * 
	 * @param number
	 * @return
	 */
	public static Long largestPrimeFactor(final Long number) {
		Long largestPrimeFactor = 0L;
		for (Long i = number - 1; i >= 3; i = i - 2) {
			System.out.println(i);
			if (number % i == 0 && Utils.isPrime(i)) {
				largestPrimeFactor = i;
				break;
			}

			if (Utils.isEven(i)) {
				i--;
			}
		}
		return largestPrimeFactor;
	}
}
