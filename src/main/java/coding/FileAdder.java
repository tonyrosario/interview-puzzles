package coding;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileAdder {

	public int calculateSum(String file) {
		int total = 0;
		try {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return total;
	}
}
