package coding;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringReverserTest {
	
	@Test
	public void reverseReturnsAReversedString() {
		String target = "Madam, I'm Adam";
		String expected = "madA m'I ,madaM";
		
		StringReverser reverser = new StringReverser();
		assertTrue(target.equals(reverser.reverse(expected)));
	}
}
