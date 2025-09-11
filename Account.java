public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;

    public Account(String accountNumber, String branch) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = 0.0;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getBranch() { return branch; }
}