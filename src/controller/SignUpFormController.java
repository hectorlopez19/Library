package controller;

import model.Model;
import view.SignUpForm;

public class SignUpFormController {
    public static SignUpForm signUpForm = new SignUpForm("Sign up");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        signUpForm.setSize(650, 350);
        signUpForm.setLocationRelativeTo(null);
        signUpForm.setVisible(true);
        reset();
    }
    public static void end() {
        signUpForm.setVisible(false);
    }

    public static void reset() {
        signUpForm.getUsernameTxt().setText("");
        signUpForm.getPasswordTxt().setText("");
        signUpForm.getPassConfirmedTxt().setText("");
        signUpForm.getAlertLabel().setText("");
        signUpForm.getSignupButton().setEnabled(false);
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static boolean confirmedPassword() {
        String password = new String(signUpForm.getPasswordTxt().getPassword());
        String confirmedPass = new String(signUpForm.getPassConfirmedTxt().getPassword());
        if(!password.isEmpty() && !confirmedPass.isEmpty()) {
            if(!password.equals(confirmedPass)) {
                signUpForm.getAlertLabel().setText("Passwords must be the same");
                return false;
            }
            else {
                signUpForm.getAlertLabel().setText("");
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static void enableSignUpBtn() {
        if(confirmedPassword() && !signUpForm.getUsernameTxt().getText().isEmpty()) {
            signUpForm.getSignupButton().setEnabled(true);
        }
        else {
            signUpForm.getSignupButton().setEnabled(false);
        }
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void signUpBtnClicked() {
        String username = signUpForm.getUsernameTxt().getText();
        String password = new String(signUpForm.getPasswordTxt().getPassword());
        if(model.searchUser(username) == -1) {
            model.registerUser(username, password);
            end();
            LoginController.start();
        }
        else {
            signUpForm.getAlertLabel().setText("Invalid username");
        }
    }

    public static void backBtnClicked() {
        end();
        LoginController.start();
    }

}
