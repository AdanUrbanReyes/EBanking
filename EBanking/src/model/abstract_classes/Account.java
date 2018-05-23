package model.abstract_classes;

import java.time.LocalDate;

import model.enumerations.AccountState;

public abstract class Account {
	
	protected int number;
	protected LocalDate openingDate;
	protected double balance;
	protected AccountState state;
	protected LocalDate inactivingDate;
	
	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	public LocalDate getInactivingDate() {
		return inactivingDate;
	}

	public void setInactivingDate(LocalDate inactivingDate) {
		this.inactivingDate = inactivingDate;
	}
	
	
}
