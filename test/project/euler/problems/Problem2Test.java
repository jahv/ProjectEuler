package project.euler.problems;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Testing class {@link Problem2}
 * 
 * @author jose.hernandez
 *
 */
public class Problem2Test {

	/**
	 * Testing solve method
	 */
	@Test
	public void solveTest() {
		Long actual = Problem2.solve(10L);
		Assertions.assertThat(actual).isEqualTo(10L);

		actual = Problem2.solve(4000000L);
		System.out.println(actual);
	}

	/**
	 * Testing fibonacciSequenceEvenValues method
	 */
	@Test
	public void fibonacciSequenceEvenValuesTest() {
		final List<Long> fibonacciSequence = Problem2.fibonacciSequenceEvenValues(10L);
		final List<Long> expected = new ArrayList<Long>();
		expected.add(2L);
		expected.add(8L);
		Assertions.assertThat(fibonacciSequence).containsExactlyElementsOf(expected);
	}

}
