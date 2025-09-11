public class InvestmentAccount extends Account implements InterestBearing {
    private static final double INTEREST_RATE = 0.05; // 5%

    public InvestmentAccount(String accountNumber, String branch) {
        super(accountNumber, branch);
    }

    @Override
    public void deposit(double amount) {
        if(balance == 0 && amount < 500) {
            throw new IllegalArgumentException("Minimum opening deposit is BWP500");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient funds in Investment Account");
        }
        balance -= amount;
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