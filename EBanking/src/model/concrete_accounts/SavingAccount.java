package model.concrete_accounts;

import model.abstract_classes.Account;

public class SavingAccount extends Account{

	private double annualTax = .16;
	
	public SavingAccount(int number, double balance, double annualTax) {
		super(number, balance);
		this.annualTax = annualTax;
	}

	public double getannualTax() {
		return annualTax;
	}

	public void setannualTax(double annualTax) {
		this.annualTax = annualTax;
	}
	
	public void calcTax() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Number : ");
		sb.append(number);
		sb.append(", Balance : ");
		sb.append(balance);
		sb.append(", Year Tax : ");
		sb.append(annualTax);
		return sb.toString();
	}

	@Override
	public void printData() {
		System.out.println(toString());
	}

}
