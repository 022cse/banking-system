package controller;

import model.Account;
import dao.AccountDAO;

public class AccountController {

    private AccountDAO accountDAO = new AccountDAO();

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        accountDAO.saveAccount(account); // DB integration
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
        accountDAO.saveAccount(account); // DB integration
    }

    public void calculateInterest(Account account) {
        account.calculateInterest();
        accountDAO.saveAccount(account); // DB integration
    }
}