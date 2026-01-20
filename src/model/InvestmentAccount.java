package model;

public class InvestmentAccount extends Account implements InterestBearing {

    private final double interestRate = 0.05;

    public InvestmentAccount(String accNo, double balance) {
        super(accNo, balance);
        if (balance < 500) {
            throw new IllegalArgumentException("Minimum deposit is BWP500");
        }
    }

    @Override
    public void calculateInterest() {
        addInterest();
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }
}