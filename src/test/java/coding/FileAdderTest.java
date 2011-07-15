package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileAdderTest {
	
	@Test
	public void sumIsCorrectTest() {
		int[] intArray = {1,1,2,3,5,8,13};
		int expected = 33;

		FileAdder adder = new FileAdder();
		assertEquals(expected, adder.calculateSum("integers.txt"));
	}
}
