package project.euler.problems;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Testing class for {@link Problem3}
 * 
 * @author jose.hernandez
 *
 */
public class Problem3Test {

	private static final Long testNumber = 13195L;

	/**
	 * Testing solve method
	 */
	@Test
	public void solveTest() {
		Long expected = 29L;
		Long actual = Problem3.solve(testNumber);
		Assertions.assertThat(actual).isEqualTo(expected);

		Long number = 600851475143L;
		System.out.println(number > number - 1);

		actual = Problem3.solve(number);
		System.out.println(actual);
	}

	/**
	 * Testing largestPrimeFactor method
	 */
	@Test
	public void largestPrimeFactorTest() {
		final Long actual = Problem3.largestPrimeFactor(testNumber);
		Assertions.assertThat(actual).isEqualTo(29L);
	}
}
