package controller;

import model.Model;


public class Main {
    public static void main(String[] args) {
        LookAndFeelController.loadLookAndFeel();
        Model model = new Model();
        model.registerUser("hectogre", "coca");
        LoginController.model = model;
        SignUpFormController.model = model;
        HomeController.model = model;
        RegisterStudentFormController.model = model;
        RegisterBookFormController.model = model;
        RegisterLoanFormController.model = model;
        StudentInfoController.model = model;
        BookInfoController.model = model;
        LoanInfoController.model = model;
        LoginController.start();
    }
}