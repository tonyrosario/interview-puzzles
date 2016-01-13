package puzzles.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveStringReverserTest {
    private StringReverser stringReverser;

    @Before
    public void setup() {
        stringReverser = new RecursiveStringReverser();
    }

    @Test
    public void itReversesAOneLetterString() {
        assertEquals("I", stringReverser.reverse("I"));
    }

    @Test
    public void itReversesATwoLetterString() {
        assertEquals("am", stringReverser.reverse("ma"));
    }

    @Test
    public void itReversesASentenceWithSpaces() {
        String target = "learning to reverse!";
        String expected = "!esrever ot gninrael";

        assertEquals(expected, stringReverser.reverse(target));
    }
}
