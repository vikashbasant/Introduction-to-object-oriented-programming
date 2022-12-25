package in.co.decimal.opps.pojo;

public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleNum();
		System.out.println(numbers.getNum1());
		System.out.println(numbers.getNum2());
	}
}
