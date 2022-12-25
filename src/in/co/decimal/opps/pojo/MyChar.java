package in.co.decimal.opps.pojo;

public class MyChar {
	private char ch;

	public MyChar() {
		// default constructor:
	}

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		boolean isVowel = false;
		if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i' || this.ch == 'o' || this.ch == 'u' || this.ch == 'A'
				|| this.ch == 'E' || this.ch == 'I' || this.ch == 'O' || this.ch == 'U') {
			isVowel = true;
		}
		return isVowel;
	}

	public boolean isAlphabet() {
		boolean isAlphabet = false;
		if ((this.ch >= 97 && this.ch <= 122) || (this.ch >= 65 && this.ch <= 90)) {
			isAlphabet = true;
		}
		return isAlphabet;
	}

	public boolean isDigit() {
		boolean isDigit = false;
//		if (this.ch == '0' || this.ch == '1' || this.ch == '2' || this.ch == '3' || this.ch == '4' || this.ch == '5'
//				|| this.ch == '6' || this.ch == '7' || this.ch == '8' || this.ch == '9') {
//			isDigit = true;
//		}

		if (ch >= 48 && ch <= 57) { // between '0' and '9'
			isDigit = true;
		}
		return isDigit;

	}

	public boolean isConsonant() {
		boolean isConsonant = false;
		// alphabet and it is not a vowel
		// ![a,e,i,o,u] or ![A,E,I,O,U]

		if (!isVowel() && isAlphabet()) { // not a vowel & it is alphabet
			isConsonant = true;
		}
		return isConsonant;
	}

	public static void printLowerCaseAlphabets() {
		for (int i = 97; i <= 122; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

	}

	public static void printUpperCaseAlphabtes() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}
