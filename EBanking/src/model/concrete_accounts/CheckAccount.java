package model.concrete_accounts;

import model.abstract_classes.Account;

public class CheckAccount extends Account{

	public double monthTax;
	public CheckAccount(int number, double balance, double monthTax) {
		super(number, balance);
		this.monthTax = monthTax;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Number : ");
		sb.append(number);
		sb.append(", Balance : ");
		sb.append(balance);
		sb.append(", Month Tax : ");
		sb.append(monthTax);
		return sb.toString();		
	}
	
}
