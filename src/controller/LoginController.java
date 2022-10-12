package controller;

import model.Model;
import model.User;
import view.ExitAlert;
import view.Login;

public class LoginController {
    public static Login login = new Login("Log in");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        login.setSize(650, 350);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        reset();
    }

    public static void end() {
        login.setVisible(false);
    }

    public static void reset() {
        login.getUsernameTxt().setText("");
        login.getPaswordTxt().setText("");
        login.getAlertLabel().setText("");
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void loginBtnClicked() {
        String username = login.getUsernameTxt().getText();
        String password = new String(login.getPaswordTxt().getPassword());
        int index = model.searchUser(username);
        if(index != -1) {
            User actualUser = model.loginUser(index, password);
            if(actualUser != null) {
                end();
                HomeController.start();
            }
            else {
                login.getAlertLabel().setText("Incorrect password");
            }
        }
        else {
            login.getAlertLabel().setText("Incorrect username");
        }

    }

    public static void signUpBtnClicked() {
        end();
        SignUpFormController.start();

    }

    public static void exitBtnClicked() {
        ExitAlertController.start();
    }

}
