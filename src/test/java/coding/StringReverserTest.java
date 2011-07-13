package coding;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringReverserTest {
	
	@Test
	public void reverseReturnsAReversedString() {
		StringReverser reverser = new StringReverser();
		assertTrue("".equals(reverser.reverse("")));
	}
}
