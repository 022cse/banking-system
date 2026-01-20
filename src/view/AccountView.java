package view;

import controller.AccountController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.*;

public class AccountView {

    private Stage stage;
    private AccountController controller = new AccountController();
    private Account account = new SavingsAccount("001", 5000);

    public AccountView(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        TextField amountField = new TextField();
        amountField.setPromptText("Amount");

        Button depositBtn = new Button("Deposit");
        Button interestBtn = new Button("Add Interest");

        Label balanceLabel = new Label("Balance: " + account.getBalance());

        depositBtn.setOnAction(e -> {
            controller.deposit(account, Double.parseDouble(amountField.getText()));
            balanceLabel.setText("Balance: " + account.getBalance());
        });

        interestBtn.setOnAction(e -> {
            controller.calculateInterest(account);
            balanceLabel.setText("Balance: " + account.getBalance());
        });

        VBox layout = new VBox(10, amountField, depositBtn, interestBtn, balanceLabel);
        stage.setScene(new Scene(layout, 300, 250));
        stage.setTitle("Account");
        stage.show();
    }
}