public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accountNumber, String branch, String employerName, String employerAddress) {
        super(accountNumber, branch);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient funds in Cheque Account");
        }
        balance -= amount;
    }

    @Override
    public void calculateInterest() {
        // No interest for cheque accounts
    }

    // Getters
    public String getEmployerName() { return employerName; }
    public String getEmployerAddress() { return employerAddress; }
}