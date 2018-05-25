package model;

import java.time.LocalDate;
import java.util.ArrayList;

import model.abstract_classes.Account;
import model.concrete_accounts.CheckAccount;
import model.concrete_accounts.SavingAccount;
import model.enumerations.AccountState;
import model.exceptions.UnFoundedAccount;
import model.interfaces.AccountService;

public class Customer implements AccountService, Comparable<Customer>{
	private static int numberSavingAccount = 0;
	private static int numberCheckAccount = 0;
	
	private int number;
	private String name;
	private Address address;
	private LocalDate birthday;
	private String rfc;
	private ArrayList<Account> accounts;
	
	public Customer(int number, String name, LocalDate birthday, String rfc) {
		this.number = number;
		this.name = name;
		this.birthday = birthday;
		this.rfc = rfc;		
	}
	
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

	@Override
	public void inactiveAccount(int id) throws UnFoundedAccount{
		Account aai = getAccount(id);
		if(aai != null) {
			aai.setState(AccountState.INACTIVE);
			aai.setInactivingDate(LocalDate.now());
		}
	}

	@Override
	public Account getAccount(int id) throws UnFoundedAccount{
		Account fa = accounts.stream().filter(a -> a.getNumber() == id).findFirst().orElse(null);
		if(fa == null) {
			throw new UnFoundedAccount(id);
		}
		return fa;
	}

	@Override
	public ArrayList<Account> getCustomerAccounts() {
		return accounts;
	}

	@Override
	public void addSavingAccount(double balance, double annualTax) {
		Account a = new SavingAccount(numberSavingAccount, balance, annualTax);
		a.setOpeningDate(LocalDate.now());
		accounts.add(a);
		numberSavingAccount++;
	}

	@Override
	public void addCheckAccount(double balance, double monthTax) {
		Account a = new CheckAccount(numberCheckAccount, balance, monthTax);
		a.setOpeningDate(LocalDate.now());
		accounts.add(a);		
		numberCheckAccount++;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Customer o) {
		return (o.getNumber() == this.getNumber()) ? 0 : (o.getNumber() < this.getNumber()) ? -1 : 1;
	}
	
}
