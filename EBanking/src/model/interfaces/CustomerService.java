package model.interfaces;

import model.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public void removeCustomer(int id);
	public void updateCustomer(Customer customer);
	public void readCustomer(int id);
	
}
