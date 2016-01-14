package puzzles.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void threeReturnsFizz() {
        Assert.assertEquals(fizzBuzz.solve(3), "Fizz");
    }

    @Test
    public void fiveReturnsBuzz() {
        Assert.assertEquals(fizzBuzz.solve(5), "Buzz");
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        Assert.assertEquals(fizzBuzz.solve(15), "FizzBuzz");
    }

    @Test
    public void oneReturnsNull() {
        Assert.assertNull(fizzBuzz.solve(1));
    }

    @Test
    public void twoReturnsNull() {
        Assert.assertNull(fizzBuzz.solve(2));
    }

    @Test
    public void zeroReturnsFizzBuzz() {
        Assert.assertEquals(fizzBuzz.solve(0), "FizzBuzz");
    }


}
