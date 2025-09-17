public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer c1 = new Customer("C001", "Lerang", "Gaofano", "Gaborone");
        Customer c2 = new Customer("C002", "Mpho", "Dube", "Francistown");

        // Open accounts for Lerang
        SavingsAccount sAcc = new SavingsAccount("001", 5000);
        InvestmentAccount iAcc = new InvestmentAccount("002", 10000);
        c1.addAccount(sAcc);
        c1.addAccount(iAcc);

        // Open account for Mpho (with employer info)
        ChequeAccount chAcc = new ChequeAccount("003", 2000, "ABC Ltd", "Gaborone CBD");
        c2.addAccount(chAcc);

        // Show initial balances
        c1.showAccounts();
        c2.showAccounts();

        // Deposit money
        sAcc.deposit(1000);
        chAcc.deposit(500);

        // Withdraw money
        iAcc.withdraw(2000);
        sAcc.withdraw(100); // should not allow
        chAcc.withdraw(2500); // should show invalid

        // Pay interest
        sAcc.calculateInterest();
        iAcc.calculateInterest();
        chAcc.calculateInterest();

        // Final balances
        System.out.println("\nFinal balances:");
        c1.showAccounts();
        c2.showAccounts();
    }
}