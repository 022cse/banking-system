package view;

import controller.LoginController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {

    private Stage stage;

    public LoginView(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        TextField idField = new TextField();
        idField.setPromptText("Customer ID");

        Button loginBtn = new Button("Login");
        Label msg = new Label();

        LoginController controller = new LoginController();

        loginBtn.setOnAction(e -> {
            if (controller.login(idField.getText())) {
                new AccountView(stage).show();
            } else {
                msg.setText("Invalid login");
            }
        });

        VBox layout = new VBox(10, idField, loginBtn, msg);
        stage.setScene(new Scene(layout, 300, 200));
        stage.setTitle("Login");
        stage.show();
    }
}