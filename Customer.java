import java.util.ArrayList;

public class Customer {
    private String id;
    private String firstName;
    private String surname;
    private String address;
    private ArrayList<Account> accounts;

    public Customer(String id, String firstName, String surname, String address) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        accounts = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getSurname() { return surname; }
    public String getAddress() { return address; }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccNo() + " added for " + firstName);
    }

    public void showAccounts() {
        System.out.println("Accounts for " + firstName + " " + surname + ":");
        for (Account acc : accounts) {
            System.out.println("- " + acc.getAccNo() + " Balance: " + acc.getBalance());
        }
    }

    public ArrayList<Account> getAccounts() { return accounts; }
}
