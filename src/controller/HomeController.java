package controller;

import model.Model;
import model.User;
import view.Home;
import view.RegisterBookForm;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import java.awt.*;

public class HomeController {
    public static Home home = new Home("TMC Library");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        home.setSize(1000, 600);
        home.setLocationRelativeTo(null);
        home.setResizable(false);
        home.setVisible(true);
    }

    public static void end() {
        home.setVisible(false);
    }


    // -------------------------------------------------- Functions --------------------------------------------------

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void registerStudent() {
        end();
        RegisterStudentFormController.start();
    }
    public static void showStudents() {
        end();
        StudentInfoController.start();
    }

    public static void registerBook() {
        end();
        RegisterBookFormController.start();
    }
    public static void showBooks() {
        end();
        BookInfoController.start();
    }

    public static void registerLoan() {
        end();
        RegisterLoanFormController.start();
    }
    public static void showLoans() {
        end();
        LoanInfoController.start();
    }

    public static void logOutBtnClicked() {
        end();
        LoginController.start();
    }
}
