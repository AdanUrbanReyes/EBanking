package model.interfaces;

import model.Customer;

public interface CustomerService {

    public void addCustomer(Customer customer);
    
    public void removeCustomer(int index);
    
    public void updateCustomer(Customer customer);
    
    public Customer getCustomer(int index);
    
}
