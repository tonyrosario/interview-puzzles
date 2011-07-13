package coding;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonnaciCalculatorTest {

	@Test
	public void calculateZeroReturnsZero() {
		int expected = 0;

		FibonnaciCalculator calc = new FibonnaciCalculator();
		assertEquals(expected, calc.calculate(0));
	}

	@Test
	public void calculateOneReturnsOne() {
		int expected = 1;

		FibonnaciCalculator calc = new FibonnaciCalculator();
		assertEquals(expected, calc.calculate(1));
	}

}
