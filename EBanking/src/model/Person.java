package model;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Person {

    private static final Logger LOG = Logger.getLogger(Address.class.getName());
    
    private String name;
    private LocalDate birthday;
    private String rfc;
    private Address address;

    public Person(){
    
    }
    
    public Person(String name, LocalDate birthday, String rfc, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.rfc = rfc;
        this.address = address;
    }

    public Person(String name, int year, int month, int day, String rfc, Address address) {
        this.name = name;
        this.birthday = LocalDate.of(year, month, day);
        this.rfc = rfc;
        this.address = address;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = birthday;
    }
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    
}
