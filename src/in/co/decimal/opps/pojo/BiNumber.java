package in.co.decimal.opps.pojo;

public class BiNumber {
	private int num1;
	private int num2;

	// constructor:
	public BiNumber() {
		// default constructor:
	}

	public BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// getter and setter:
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// method:
	public int add() {
		int sum;
		sum = this.num1 + this.num2;
		return sum;
	}

	public int multiply() {
		int multiple;
		multiple = this.num1 * this.num2;
		return multiple;
	}

	public void doubleNum() {
		setNum1(this.num1 * 2);
		setNum2(this.num2 * 2);
	}

}
