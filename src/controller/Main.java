package controller;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import model.Model;
import view.RegisterBookForm;
import view.RegisterLoanForm;
import view.RegisterStudentForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.registerUser("hectogre", "coca");
        LoginController.model = model;
        SignUpFormController.model = model;
        HomeController.model = model;
        RegisterStudentFormController.model = model;
        RegisterBookFormController.model = model;
        RegisterLoanFormController.model = model;
        LoginController.start();
    }
}