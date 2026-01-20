package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerId;
    private String firstName;
    private String surname;
    private String address;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String customerId, String firstName, String surname, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getCustomerId() {
        return customerId;
    }
}