package model;

public class Address {

	private String street;
	private String number;
	private String colony;
	private String city;
	private int postalCode;
	
	
	
	public Address(String street, String number, String colony, String city, String postalCode) {
		this.street = street;
		this.number = number;
		this.colony = colony;
		this.city = city;
		if(postalCode.trim().length() == 5) {
			try {
				this.postalCode = Integer.parseInt(postalCode);	
			}catch(Exception e) {
				
			}
		}
		
	}
	
	
	
	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getColony() {
		return colony;
	}



	public void setColony(String colony) {
		this.colony = colony;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(city);
		sb.append(" ");
		sb.append(colony);
		sb.append(" ");
		sb.append(street);
		sb.append(" ");
		sb.append(number);
		sb.append(" ");
		sb.append(postalCode);
		return sb.toString();
	}
	
}
