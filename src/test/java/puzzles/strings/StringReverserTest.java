package puzzles.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import puzzles.strings.StringReverser;

public class StringReverserTest {

    @Test
    public void reverseReturnsAReversedString() {
        String target = "Madam, I'm Adam";
        String expected = "madA m'I ,madaM";

        StringReverser reverser = new StringReverser();
        assertEquals(expected, reverser.reverse(target));
    }

    @Test
    public void recursiveReverseReturnsAReversedString() {
        String target = "Madam, I'm Adam";
        String expected = "madA m'I ,madaM";

        StringReverser reverser = new StringReverser();
        assertEquals(expected, reverser.recursiveReverse(target));
    }
}
