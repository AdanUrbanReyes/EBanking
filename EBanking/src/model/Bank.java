package model;

import java.util.ArrayList;
import model.interfaces.CustomerService;

public class Bank implements CustomerService {
    
    private volatile static Bank instance;
    private String name;
    private Address address;
    private String rfc;
    private String phone;
    private ArrayList<Customer> customers;

    public Bank(String name, Address address, String rfc, String phone) {
        this.name = name;
        this.address = address;
        this.rfc = rfc;
        this.phone = phone;
    }
    
    
    
    public static Bank getInstance(String name, Address address, String rfc, String phone){
        if(instance == null){
            synchronized(Bank.class){
                if(instance == null){
                    instance = new Bank(name, address, rfc, phone);
                }
            }
        }
        return instance;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }    
    
    @Override
    public void addCustomer(Customer customer){
        customers.add(customer);
    } 
    
    @Override
    public void removeCustomer(int index){
        if(index > -1 && index < customers.size() ){
            customers.remove(index);
        }
        
    }
    
    @Override
    public void updateCustomer(Customer customer){
        int i = customers.indexOf(customer);
        if(i != -1){
            customers.set(i, customer);
        }
    }
    
    @Override
    public Customer getCustomer(int index){
        if(index > -1 && index < customers.size() ){
            return customers.get(index);
        }
        return new Customer();
    }
}
