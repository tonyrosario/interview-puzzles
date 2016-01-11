package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileAdderTest {

    @Test
    public void sumIsCorrectTest() {
        int expected = 33;

        FileAdder adder = new FileAdder();
        assertEquals(expected, adder.calculateSum("src/main/resources/integers.txt"));
    }
}
