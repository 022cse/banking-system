public class SavingsAccount extends Account implements InterestBearing {
    private static final double INTEREST_RATE = 0.0005; // 0.05%

    public SavingsAccount(String accountNumber, String branch) {
        super(accountNumber, branch);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals not allowed from Savings Account");
    }

    @Override
    public void calculateInterest() {
        balance += balance * INTEREST_RATE;
    }

    @Override
    public void payInterest() {
        calculateInterest();
    }
}
