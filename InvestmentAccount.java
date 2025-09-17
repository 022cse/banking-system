public class InvestmentAccount extends Account implements InterestBearing {
    private final double interestRate = 0.05; // 5% monthly

    public InvestmentAccount(String accNo, double initialDeposit) {
        super(accNo, initialDeposit);
        if (initialDeposit < 500) {
            throw new IllegalArgumentException("InvestmentAccount requires minimum BWP500 deposit.");
        }
    }

    @Override
    public void calculateInterest() {
        addInterest();
    }

    @Override
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest added to InvestmentAccount: " + interest);
    }
}
