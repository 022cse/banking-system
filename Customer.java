import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerID;
    private String firstname;
    private String surname;
    private String address;
    private String contactNumber;
    private List<Account> accounts;

    public Customer(String customerID, String firstname, String surname, String address, String contactNumber) {
        this.customerID = customerID;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.contactNumber = contactNumber;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void applyInterestToAccounts() {
        for (Account acc : accounts) {
            if (acc instanceof InterestBearing) {
                ((InterestBearing) acc).payInterest();
            }
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getCustomerID() { return customerID; }
    public String getFullName() { return firstname + " " + surname; }
}