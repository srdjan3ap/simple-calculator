package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add3and7() {
		int result = Calculator.add(3, 7);
		Assert.assertEquals(result, 10);
	}
	
}
