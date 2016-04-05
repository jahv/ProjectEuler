package project.euler.problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testing class for {@link Problem1}
 * 
 * @author jose.hernandez
 *
 */
public class Problem1Test {

	/**
	 * Testing solve method
	 */
	@Test
	public void getSolveTest() {
		Long result = Problem1.solve(10L, 3L, 5L);
		Assert.assertEquals(new Long(23), result);

		result = Problem1.solve(1000L, 3L, 5L);
		System.out.println(result);
	}

}
