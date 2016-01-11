package coding;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileAdder {

    public int calculateSum(String file) {
        int total = 0;
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(file));

            for (String line = inFile.readLine(); line != null; line = inFile.readLine()) {
                total += Integer.valueOf(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return total;
    }
}
