package coding;

public class FibonnaciCalculator {

	public int calculate(int nthFibNumber) {
		return nthFibNumber <= 1 ? nthFibNumber : calculate(nthFibNumber-1) + calculate(nthFibNumber - 2);
	}

}
