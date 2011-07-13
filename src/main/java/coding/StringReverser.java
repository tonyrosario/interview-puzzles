package coding;

public class StringReverser {

	public String reverse(String string) {
		char[] charArray = string.toCharArray();
		int length = charArray.length - 1;
		for (int i = 0; i < length / 2; i++) {
			char c = charArray[i];
			charArray[i] = charArray[length - i];
			charArray[length - i] = c;
		}
		return new String(charArray);
	}

}
