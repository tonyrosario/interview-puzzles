package coding;

public class FibonnaciCalculator {

    //when number is around 43, the performance really starts to slow down.
    public int calculate(int number) {
        return number <= 1 ? number : calculate(number - 1) + calculate(number - 2);
    }

}
