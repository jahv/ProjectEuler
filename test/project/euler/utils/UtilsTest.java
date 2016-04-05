package project.euler.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import project.euler.problems.utils.Utils;

/**
 * Testing class for {@link Utils}
 * 
 * @author jose.hernandez
 *
 */
public class UtilsTest {

	/**
	 * Testing sumAll methods
	 */
	@Test
	public void sumAllTest() {
		final List<Long> list = new ArrayList<Long>();
		list.add(10L);
		list.add(20L);

		final Long actual = Utils.sumAll(list);

		Assertions.assertThat(actual).isEqualTo(30L);
	}

	/**
	 * Testing fibonacci method
	 */
	@Test
	public void fibonacciTest() {
		Long actual = Utils.fibonacci(0L);
		Assertions.assertThat(actual).isEqualTo(1L);

		actual = Utils.fibonacci(1L);
		Assertions.assertThat(actual).isEqualTo(1L);

		actual = Utils.fibonacci(2L);
		Assertions.assertThat(actual).isEqualTo(2L);

		actual = Utils.fibonacci(3L);
		Assertions.assertThat(actual).isEqualTo(3L);

		actual = Utils.fibonacci(10L);
		Assertions.assertThat(actual).isEqualTo(89L);
	}

	/**
	 * Testing isEven method
	 */
	@Test
	public void isEvenTest() {
		boolean actual = Utils.isEven(1L);
		Assertions.assertThat(actual).isFalse();

		actual = Utils.isEven(2L);
		Assertions.assertThat(actual).isTrue();

		actual = Utils.isEven(0L);
		Assertions.assertThat(actual).isTrue();
	}

	/**
	 * Testing separateEvenOdd method
	 */
	@Test
	public void separateEvenOddTest() {
		final List<Long> numbers = new ArrayList<Long>();
		numbers.add(1L);
		numbers.add(2L);
		numbers.add(3L);
		numbers.add(4L);

		final Map<String, List<Long>> actual = Utils.separateEvenOdd(numbers);

		Assertions.assertThat(actual).isNotNull();
		Assertions.assertThat(actual.get("even")).isNotNull();
		Assertions.assertThat(actual.get("odd")).isNotNull();
		Assertions.assertThat(actual.get("even")).contains(2L, 4L);
		Assertions.assertThat(actual.get("odd")).contains(1L, 3L);
	}

	/**
	 * Testing isPrime method
	 */
	@Test
	public void isPrimeTest() {
		boolean actual = Utils.isPrime(1L);
		Assertions.assertThat(actual).isTrue();

		actual = Utils.isPrime(2L);
		Assertions.assertThat(actual).isTrue();

		actual = Utils.isPrime(3L);
		Assertions.assertThat(actual).isTrue();

		actual = Utils.isPrime(4L);
		Assertions.assertThat(actual).isFalse();

		actual = Utils.isPrime(5L);
		Assertions.assertThat(actual).isTrue();

		actual = Utils.isPrime(6L);
		Assertions.assertThat(actual).isFalse();

		actual = Utils.isPrime(19L);
		Assertions.assertThat(actual).isTrue();
	}
}
