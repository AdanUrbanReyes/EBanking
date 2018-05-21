package model;

import java.util.logging.Logger;

public class Address {
    
    private static final Logger LOG = Logger.getLogger(Address.class.getName());
    
    private String street;
    private String number;
    private String colony;
    private String city;
    private int postalCode;
    
    public Address(){
    
    }

    public Address(String street, String number, String colony, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.colony = colony;
        this.city = city;
        try{
            this.postalCode = Integer.parseInt(postalCode);
        }catch(IllegalArgumentException iae){
            LOG.info("Exception parsing postal code " + iae.toString());
        }
    }

    
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street != null && !street.trim().equals("")){
            this.street = street;   
        }
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
        String t = postalCode + "";
        if(t.length() == 5){
        
        }
        this.postalCode = postalCode;
    }
       
}