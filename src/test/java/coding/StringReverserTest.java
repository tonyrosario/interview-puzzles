package coding;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringReverserTest {
	
	@Test
	public void reverseReturnsAReversedString() {
		String target = "Madam, I'm Adam";
		String expected = "madA m'I ,madaM";
		
		StringReverser reverser = new StringReverser();
		assertEquals(target, expected);
	}
}
