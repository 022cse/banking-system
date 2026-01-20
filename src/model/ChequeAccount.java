package model;

public class ChequeAccount extends Account {

    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accNo, double balance, String employerName, String employerAddress) {
        super(accNo, balance);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Cheque account earns no interest");
    }
}