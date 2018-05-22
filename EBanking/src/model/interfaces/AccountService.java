package model.interfaces;

import java.util.ArrayList;

import model.Account;

public interface AccountService {

	public void inactiveAccount(int id);
	public Account getAccount(int id);
	public ArrayList<Account> getCustomerAccounts();
	public void addSavingAccount(double balance, double annualTax);
	public void addCheckAccount(double balance, double monthTax);
	
}
