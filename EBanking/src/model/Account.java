package model;

import java.time.LocalDate;
import java.util.logging.Logger;
import model.enumerations.AccountState;

public abstract class Account {

    private static final Logger LOG = Logger.getLogger(Address.class.getName());
    
    private int id;
    private LocalDate openingDate;
    private double amount;
    private AccountState state;
    private LocalDate cancellingDate;

    public Account(){
    
    }
    
    public Account(int id, LocalDate openingDate, double amount, AccountState state, LocalDate cancellingDate) {
        this.id = id;
        this.openingDate = openingDate;
        this.amount = amount;
        this.state = state;
        this.cancellingDate = cancellingDate;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public LocalDate getCancellingDate() {
        return cancellingDate;
    }

    public void setCancellingDate(LocalDate cancellingDate) {
        this.cancellingDate = cancellingDate;
    }
    
    public void pay(double amount){
        this.amount = amount;
    }
    
    public void drop(double amount){
        this.amount -= amount;
    }
    
    
}
