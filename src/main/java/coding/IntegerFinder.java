package coding;

public class IntegerFinder {

	public int findLargest(int[] intArray) {
		int currentMax = 0;
		
		for (int i=0; i<intArray.length;i++) {
			if (intArray[i] > currentMax) {
				currentMax = intArray[i];
			}
		}
		return currentMax;
	}
}
