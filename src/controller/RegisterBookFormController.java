package controller;

import model.Model;
import view.RegisterBookForm;
import view.RegisterStudentForm;

public class RegisterBookFormController {
    public static RegisterBookForm registerBookForm = new RegisterBookForm("Book form");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        registerBookForm.setSize(1000, 600);
        registerBookForm.setLocationRelativeTo(null);
        registerBookForm.setVisible(true);
        reset();
    }

    public static void end() {
        registerBookForm.setVisible(false);
    }

    public static void reset() {
        registerBookForm.getTitleTxt().setText("");
        registerBookForm.getAuthorTxt().setText("");
        registerBookForm.getEditionTxt().setText("");
        registerBookForm.getIdTxt().setText("");
        registerBookForm.getTitleAlertLabel().setText("");
        registerBookForm.getAuthorAlertLabel().setText("");
        registerBookForm.getEditionAlertLabel().setText("");
        registerBookForm.getIdAlertLabel().setText("");
    }


    // -------------------------------------------------- Functions --------------------------------------------------
    public static boolean correctInfo() {
        boolean correct = false;
        if(registerBookForm.getTitleTxt().getText().isEmpty()) {
            registerBookForm.getTitleAlertLabel().setText("Name field is empty");
            correct = false;
        }
        else {
            registerBookForm.getTitleAlertLabel().setText("");
            correct = true;
        }
        if(registerBookForm.getAuthorTxt().getText().isEmpty()) {
            registerBookForm.getAuthorAlertLabel().setText("ID field is empty");
            correct = false;
        }
        else {
            registerBookForm.getAuthorAlertLabel().setText("");
            correct = true;
        }
        if(registerBookForm.getEditionTxt().getText().isEmpty()) {
            registerBookForm.getEditionAlertLabel().setText("Career field is empty");
            correct = false;
        }
        else {
            registerBookForm.getEditionAlertLabel().setText("");
            correct = true;
        }
        if(registerBookForm.getIdTxt().getText().isEmpty()) {
            registerBookForm.getIdAlertLabel().setText("Grade field is empty");
            correct = false;
        }
        else {
            registerBookForm.getIdAlertLabel().setText("");
            correct = true;
        }
        return correct;
    }

    public static void register(String title, String author, String edition, String id) {
        if(model.searchBook(id) != null) {
            registerBookForm.getIdAlertLabel().setText("Student already registered");
        }
        else {
            model.registerBook(title, author, edition, id);
        }
    }


    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void saveBtnClicked() {
        if(correctInfo()) {
            String title = registerBookForm.getTitleTxt().getText();
            String author = registerBookForm.getAuthorTxt().getText();
            String edition = registerBookForm.getEditionTxt().getText();
            String id = registerBookForm.getIdTxt().getText();
            register(title, author, edition, id);
            end();
            HomeController.start();
        }
    }

    public static void cleanBtnClicked() {
        reset();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }
}
