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
        System.out.println("ChequeAccount does not earn interest.");
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }
}
