package model;

public class SavingsAccount extends Account implements InterestBearing {

    private final double interestRate = 0.0005;

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed for Savings Account");
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
