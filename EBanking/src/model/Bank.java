package model;

import java.util.ArrayList;

import model.exceptions.UnFoundedCustomer;
import model.interfaces.CustomerService;

public class Bank implements CustomerService{

	private volatile static Bank instance;
	private String name;
	private Address address;
	private String rfc;
	private String phone;
	private ArrayList<Customer> customers;
	
	private Bank(String name, Address address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public static Bank getInstance(String name, Address address, String phone) {
		if(Bank.instance == null) {
			synchronized (Bank.class) {
				if(Bank.instance == null) {
					Bank.instance = new Bank(name, address, phone);	
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	@Override
	public void removeCustomer(int id) throws UnFoundedCustomer {
		if(customers.stream().filter(c -> c.getNumber() == id).findFirst().orElse(null) != null) {
			customers.removeIf(c -> c.getNumber() == id );	
		}else {
			throw new UnFoundedCustomer(id) ;
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) throws UnFoundedCustomer{
		removeCustomer(customer.getNumber());
		addCustomer(customer);
	}

	@Override
	public Customer readCustomer(int id) throws UnFoundedCustomer{
		Customer fc = customers.stream().filter(c -> c.getNumber() == id).findFirst().orElse(null);
		if(fc == null) {
			throw new UnFoundedCustomer(id);
		}
		return fc;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}