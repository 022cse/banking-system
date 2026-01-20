package app;

import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // === Create customers and accounts ===
        Customer c1 = new Customer("C001", "Lerang", "Gaofano", "Gaborone");
        Customer c2 = new Customer("C002", "Mpho", "Dube", "Francistown");

        SavingsAccount sAcc = new SavingsAccount("001", 5000);
        InvestmentAccount iAcc = new InvestmentAccount("002", 10000);
        ChequeAccount chAcc = new ChequeAccount("003", 2000, "ABC Ltd", "Gaborone CBD");

        c1.addAccount(sAcc);
        c1.addAccount(iAcc);
        c2.addAccount(chAcc);

        // === Scanner ===
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Show Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    c1.showAccounts();
                    c2.showAccounts();
                    break;

                case 2:
                    System.out.println("Select account to deposit into:");
                    System.out.println("1. " + sAcc.getAccNo() + " (SavingsAccount)");
                    System.out.println("2. " + iAcc.getAccNo() + " (InvestmentAccount)");
                    System.out.println("3. " + chAcc.getAccNo() + " (ChequeAccount)");
                    int depChoice = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depAmount = sc.nextDouble();
                    switch (depChoice) {
                        case 1: sAcc.deposit(depAmount); break;
                        case 2: iAcc.deposit(depAmount); break;
                        case 3: chAcc.deposit(depAmount); break;
                        default: System.out.println("Invalid account choice"); break;
                    }
                    break;

                case 3:
                    System.out.println("Select account to withdraw from:");
                    System.out.println("1. " + sAcc.getAccNo() + " (SavingsAccount)");
                    System.out.println("2. " + iAcc.getAccNo() + " (InvestmentAccount)");
                    System.out.println("3. " + chAcc.getAccNo() + " (ChequeAccount)");
                    int withChoice = sc.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withAmount = sc.nextDouble();
                    switch (withChoice) {
                        case 1: sAcc.withdraw(withAmount); break;
                        case 2: iAcc.withdraw(withAmount); break;
                        case 3: chAcc.withdraw(withAmount); break;
                        default: System.out.println("Invalid account choice"); break;
                    }
                    break;

                case 4:
                    System.out.println("Calculating interest for eligible accounts...");
                    sAcc.calculateInterest();
                    iAcc.calculateInterest();
                    chAcc.calculateInterest();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        sc.close();
    }
}