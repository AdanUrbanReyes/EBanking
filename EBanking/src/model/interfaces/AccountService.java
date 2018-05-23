package model.interfaces;

import java.util.ArrayList;

import model.abstract_classes.Account;
import model.exceptions.UnFoundedAccount;

public interface AccountService {

	public void inactiveAccount(int id) throws UnFoundedAccount;
	public Account getAccount(int id) throws UnFoundedAccount;
	public ArrayList<Account> getCustomerAccounts();
	public void addSavingAccount(double balance, double annualTax);
	public void addCheckAccount(double balance, double monthTax);
	
}
