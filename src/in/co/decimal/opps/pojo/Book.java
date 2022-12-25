package in.co.decimal.opps.pojo;

public class Book {
	private int noOfCopy;

	public Book() {
		// default constructor:s
	}

	public Book(int intialCopies) {
		this.noOfCopy = intialCopies;
	}

	public int getNoOfBookCopy() {
		return noOfCopy;
	}

	public void setNoOfBookCopy(int noOfCopy) {
		if (noOfCopy > 0) {
			this.noOfCopy = noOfCopy;
		}

	}

	public void increaseNoOfCopy(int howMuch) {
		setNoOfBookCopy(this.noOfCopy + howMuch);
	}

	public void decreaseNoOfCopy(int howMuch) {
//		if (howMuch > this.noOfCopy) {
//			this.noOfCopy = 0;
//		} else {
//			this.noOfCopy -= howMuch;
//		}

		// another method:
		setNoOfBookCopy(this.noOfCopy - howMuch);

	}
}
