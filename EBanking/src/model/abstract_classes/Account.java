package model.abstract_classes;

import java.time.LocalDate;

import model.enumerations.AccountState;
import model.exceptions.NotEnoughBalance;

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
	

	public void addToBalance(double ammount) {
		balance += ammount;
	}
	
	public void substractToBalance(double ammount) throws NotEnoughBalance {
		if(balance < ammount) {
			throw new NotEnoughBalance();
		}
		balance -= ammount;
	}	
	
	public abstract void printData();
	
}
