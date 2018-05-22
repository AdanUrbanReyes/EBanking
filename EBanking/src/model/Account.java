package model;

import java.time.LocalDate;

import model.enumerations.AccountState;

public abstract class Account {

	private int number;
	private LocalDate openingDate;
	private double balance;
	private AccountState state;
	private LocalDate inactivingDate;
	
	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}
	
	
	
}
