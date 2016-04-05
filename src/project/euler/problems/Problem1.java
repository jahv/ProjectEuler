package project.euler.problems;

import java.util.ArrayList;
import java.util.List;

import project.euler.problems.utils.Utils;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.

 * @author jose.hernandez
 *
 */
public class Problem1 {

	/**
	 * solve the problem
	 * 
	 * @param baseNumber
	 * @param multiples
	 * @return
	 */
	public static Long solve(final Long baseNumber, final Long multiple1, final Long multiple2) {
		final List<Long> multiplesList = Problem1.getMultiples(baseNumber, multiple1, multiple2);
		return Utils.sumAll(multiplesList);
	}

	/**
	 * Method to get all multiples multiple1 and multiple2 below baseNumber
	 *  
	 * @param baseNumber
	 * @param multiples
	 * @return
	 */
	public static List<Long> getMultiples(final Long baseNumber, final Long multiple1, final Long multiple2) {
		final List<Long> multiplesList = new ArrayList<Long>();
		for (int i = 1; i < baseNumber; i++) {
			if (i % multiple1 == 0 || i % multiple2 == 0) {
				multiplesList.add(Long.valueOf(i));
			}
		}
		return multiplesList;
	}

}
