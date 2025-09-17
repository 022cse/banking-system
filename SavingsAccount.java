public class SavingsAccount extends Account implements InterestBearing {
    private final double interestRate = 0.0005; // 0.05% monthly

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void calculateInterest() {
        addInterest();
    }

    @Override
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest added to SavingsAccount: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed from SavingsAccount.");
    }
}
