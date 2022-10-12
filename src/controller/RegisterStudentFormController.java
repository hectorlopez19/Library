package controller;

import model.Model;
import view.Home;
import view.RegisterStudentForm;

public class RegisterStudentFormController {
    public static RegisterStudentForm  registerStudentForm = new RegisterStudentForm("Student form");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        registerStudentForm.setSize(1000, 600);
        registerStudentForm.setLocationRelativeTo(null);
        registerStudentForm.setVisible(true);
        reset();
    }

    public static void end() {
        registerStudentForm.setVisible(false);
    }

    public static void reset() {
        registerStudentForm.getNameTxt().setText("");
        registerStudentForm.getIdTxt().setText("");
        registerStudentForm.getCareerTxt().setText("");
        registerStudentForm.getGradeTxt().setText("");
        registerStudentForm.getNameAlertLabel().setText("");
        registerStudentForm.getIdAlertLabel().setText("");
        registerStudentForm.getCareerAlertLabel().setText("");
        registerStudentForm.getGradeAlertLabel().setText("");
    }


    // -------------------------------------------------- Functions --------------------------------------------------
    public static boolean correctInfo() {
        boolean correct = false;
        if(registerStudentForm.getNameTxt().getText().isEmpty()) {
            registerStudentForm.getNameAlertLabel().setText("Name field is empty");
            correct = false;
        }
        else {
            registerStudentForm.getNameAlertLabel().setText("");
            correct = true;
        }
        if(registerStudentForm.getIdTxt().getText().isEmpty()) {
            registerStudentForm.getIdAlertLabel().setText("ID field is empty");
            correct = false;
        }
        else {
            registerStudentForm.getIdAlertLabel().setText("");
            correct = true;
        }
        if(registerStudentForm.getCareerTxt().getText().isEmpty()) {
            registerStudentForm.getCareerAlertLabel().setText("Career field is empty");
            correct = false;
        }
        else {
            registerStudentForm.getCareerAlertLabel().setText("");
            correct = true;
        }
        if(registerStudentForm.getGradeTxt().getText().isEmpty()) {
            registerStudentForm.getGradeAlertLabel().setText("Grade field is empty");
            correct = false;
        }
        else {
            registerStudentForm.getGradeAlertLabel().setText("");
            correct = true;
        }
        return correct;
    }

    public static void register(String name, String id, String career, int grade) {
        if(model.searchStudent(id) != null) {
            registerStudentForm.getIdAlertLabel().setText("Book already registered");
        }
        else {
            model.registerStudent(name, id, career, grade);
        }
    }


    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void saveBtnClicked() {
        if(correctInfo()) {
            String name = registerStudentForm.getNameTxt().getText();
            String id = registerStudentForm.getIdTxt().getText();
            String career = registerStudentForm.getCareerTxt().getText();
            int grade = Integer.parseInt(registerStudentForm.getGradeTxt().getText());
            register(name, id, career, grade);
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
