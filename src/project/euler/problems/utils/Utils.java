package project.euler.problems.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Reusable methods
 * 
 * @author jose.hernandez
 *
 */
public class Utils {

	/**
	 * Sum all entries of a list
	 * 
	 * @param list
	 * @return
	 */
	public static Long sumAll(final List<Long> list) {
		Long result = 0L;
		for (final Long entry : list) {
			result += entry;
		}
		return result;
	}

	/**
	 * Return list of all Fibonacci numbers below than limit
	 * 
	 * @param limit
	 * @return
	 */
	public static Long fibonacci(final Long limit) {
		if (limit == 1 || limit == 0) {
			return 1L;
		}
		else {
			return fibonacci(limit - 2) + fibonacci(limit - 1);
		}
	}

	/**
	 * Verify if number is even/odd
	 * Returns true for even otherwise false;
	 * @param number
	 * @return
	 */
	public static boolean isEven(final Long number) {
		return number % 2 == 0;
	}

	/**
	 * Method to separate even numbers and odd numbers from a single list
	 * Return Map 
	 * 		keys: 
	 * 			even = List of even numbers
	 * 			odd = List of odd numbers
	 *  
	 * @param list
	 * @return
	 */
	public static Map<String, List<Long>> separateEvenOdd(final List<Long> list) {
		final List<Long> even = new ArrayList<Long>();
		final List<Long> odd = new ArrayList<Long>();

		for (final Long number : list) {
			if (isEven(number)) {
				even.add(number);
			}
			else {
				odd.add(number);
			}
		}

		final Map<String, List<Long>> result = new HashMap<String, List<Long>>();
		result.put("even", even);
		result.put("odd", odd);

		return result;
	}

	/**
	 * Method to verify if a number is prime
	 * @param number
	 * @return
	 */
	public static boolean isPrime(final Long number) {
		if (number.equals(2L) || number.equals(3L)) {
			return true;
		}

		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}

		Long i = 5L;
		Long w = 2L;
		while (i * i <= number) {
			if (number % i == 0) {
				return false;
			}

			i += w;
			w = 6 - w;
		}
		return true;
	}

}
