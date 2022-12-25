package in.co.decimal.opps.pojo;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('a');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());

		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());

		// here this is nothing but static method:
		// because we know that static method called by used of className.methodName()
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabtes();

	}
}
