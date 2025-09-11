public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer c1 = new Customer("C001", "Lerang", "Gaofano", "Gaborone", "71234567");

        // Open accounts
        Account savings = new SavingsAccount("A001", "Main Branch");
        Account investment = new InvestmentAccount("A002", "Main Branch");
        Account cheque = new ChequeAccount("A003", "Main Branch", "ABC Ltd", "Gaborone");

        c1.openAccount(savings);
        c1.openAccount(investment);
        c1.openAccount(cheque);

        // Deposits
        c1.deposit(savings, 5000);
        c1.deposit(investment, 10000);
        c1.deposit(cheque, 3000);

        // Apply interest
        c1.applyInterestToAccounts();

        // Print balances
        for (Account acc : c1.getAccounts()) {
            System.out.println("Account: " + acc.getAccountNumber() + " | Balance: " + acc.getBalance());
        }

        // Withdrawals
        c1.withdraw(investment, 2000);
        c1.withdraw(cheque, 1000);

        System.out.println("After withdrawals:");
        for (Account acc : c1.getAccounts()) {
            System.out.println("Account: " + acc.getAccountNumber() + " | Balance: " + acc.getBalance());
        }

        // Try invalid withdrawal from Savings
        try {
            c1.withdraw(savings, 1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}