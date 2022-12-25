package in.co.decimal.opps.pojo;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator() {
		// default constructor:
	}

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		// total Value = principal + principal * iterset * noOfYears;
		BigDecimal totalValue;
		totalValue = this.principal.add((this.principal.multiply(this.interest)).multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}
}
