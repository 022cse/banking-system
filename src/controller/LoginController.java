package controller;

public class LoginController {

    public boolean login(String customerId) {
        return customerId != null && !customerId.isEmpty();
    }
}