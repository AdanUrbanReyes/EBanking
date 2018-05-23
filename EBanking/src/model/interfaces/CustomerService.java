package model.interfaces;

import model.Customer;
import model.exceptions.UnFoundedCustomer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public void removeCustomer(int id) throws UnFoundedCustomer;
	public void updateCustomer(Customer customer) throws UnFoundedCustomer;
	public Customer readCustomer(int id) throws UnFoundedCustomer;
	
}
