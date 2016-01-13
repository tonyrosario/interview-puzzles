package puzzles.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FibonnaciTest {
    private Fibonacci fibonacci;

    private List<Integer> sequence = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610);

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void itReturnsZeroForZero() {
        Assert.assertEquals(fibonacci.fib(0), 0);
    }

    @Test
    public void itReturnsOneForOne() {
        Assert.assertEquals(fibonacci.fib(1), 1);
    }

    @Test
    public void itReturnsOneForTwo() {
        Assert.assertEquals(fibonacci.fib(2), 1);
    }

    @Test
    public void itReturnsTwoForThree() {
        Assert.assertEquals(fibonacci.fib(3), 2);
    }

    @Test
    public void itCalculatesUpToThe15thNumber() {
        for (int i = 0; i < sequence.size(); i++) {
            Assert.assertEquals(fibonacci.fib(i), sequence.get(i).intValue());
        }
    }
}
