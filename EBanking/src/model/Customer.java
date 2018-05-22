package model;

import java.time.LocalDate;
import java.util.ArrayList;

import model.interfaces.AccountService;

public class Customer implements AccountService{

	private int number;
	private String name;
	private Address address;
	private LocalDate birthday;
	private String rfc;
	private ArrayList<Account> accounts;
	
	public Customer(int number, String name, Address address, String rfc, int year, int month, int day) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.birthday = LocalDate.of(year, month, day);
		this.rfc = rfc;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public String getRfc() {
		return rfc;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	@Override
	public void inactiveAccount(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Account> getCustomerAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSavingAccount(double balance, double annualTax) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCheckAccount(double balance, double monthTax) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
