package coding;

public class MultiplicationTableGenerator {

	public void generate(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(String.format("%4d", i * j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MultiplicationTableGenerator generator = new MultiplicationTableGenerator();

		generator.generate(12);
	}
}
