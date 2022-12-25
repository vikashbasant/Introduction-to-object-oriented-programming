package in.co.decimal.opps.pojo;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgrammingBook = new Book(567);
		Book effectiveJavaBook = new Book(100);
		Book cleanCodeBook = new Book(456);

		artOfComputerProgrammingBook.setNoOfBookCopy(100);
		artOfComputerProgrammingBook.increaseNoOfCopy(100);
		artOfComputerProgrammingBook.decreaseNoOfCopy(50);

		effectiveJavaBook.setNoOfBookCopy(80);
		effectiveJavaBook.increaseNoOfCopy(50);
		effectiveJavaBook.decreaseNoOfCopy(50);

		cleanCodeBook.setNoOfBookCopy(70);
		cleanCodeBook.increaseNoOfCopy(60);
		cleanCodeBook.decreaseNoOfCopy(140);

		System.out.println(artOfComputerProgrammingBook.getNoOfBookCopy());
		System.out.println(effectiveJavaBook.getNoOfBookCopy());
		System.out.println(cleanCodeBook.getNoOfBookCopy());

	}
}
