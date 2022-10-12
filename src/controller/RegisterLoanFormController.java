package controller;

import model.Book;
import model.Model;
import model.Student;
import view.RegisterBookForm;
import view.RegisterLoanForm;

public class RegisterLoanFormController {
    public static RegisterLoanForm registerLoanForm = new RegisterLoanForm("Loan form");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        registerLoanForm.setSize(1000, 600);
        registerLoanForm.setLocationRelativeTo(null);
        registerLoanForm.setVisible(true);
        reset();
    }

    public static void end() {
        registerLoanForm.setVisible(false);
    }

    public static void reset() {
        registerLoanForm.getStudentTxt().setText("");
        registerLoanForm.getBookTxt().setText("");
        registerLoanForm.getLoanMonthTxt().setText("");
        registerLoanForm.getLoanDayTxt().setText("");
        registerLoanForm.getLoanYearTxt().setText("");
        registerLoanForm.getReturnMonthTxt().setText("");
        registerLoanForm.getReturnDayTxt().setText("");
        registerLoanForm.getReturnYearTxt().setText("");
        registerLoanForm.getStudentAlertLabel().setText("");
        registerLoanForm.getBookAlertLabel().setText("");
        registerLoanForm.getLoanDateAlertLabel().setText("");
        registerLoanForm.getReturnDateAlertLabel().setText("");
    }


    // -------------------------------------------------- Functions --------------------------------------------------
    public static boolean correctInfo() {
        boolean correct = false;
        if(registerLoanForm.getStudentTxt().getText().isEmpty()) {
            registerLoanForm.getStudentAlertLabel().setText("Student ID field is empty");
            correct = false;
        }
        else {
            registerLoanForm.getStudentAlertLabel().setText("");
            correct = true;
        }
        if(registerLoanForm.getBookTxt().getText().isEmpty()) {
            registerLoanForm.getBookAlertLabel().setText("Book ID field is empty");
            correct = false;
        }
        else {
            registerLoanForm.getBookAlertLabel().setText("");
            correct = true;
        }
        if(registerLoanForm.getLoanMonthTxt().getText().isEmpty() || registerLoanForm.getLoanDayTxt().getText().isEmpty() || registerLoanForm.getLoanYearTxt().getText().isEmpty()) {
            registerLoanForm.getLoanDateAlertLabel().setText("Invalid loan date");
            correct = false;
        }
        else {
            registerLoanForm.getLoanDateAlertLabel().setText("");
            correct = true;
        }
        if(registerLoanForm.getReturnMonthTxt().getText().isEmpty() || registerLoanForm.getReturnDayTxt().getText().isEmpty() || registerLoanForm.getReturnYearTxt().getText().isEmpty()) {
            registerLoanForm.getLoanDateAlertLabel().setText("Invalid return date");
            correct = false;
        }
        else {
            registerLoanForm.getLoanDateAlertLabel().setText("");
            correct = true;
        }
        return correct;
    }

    public static void register(Student student, Book book, String loanDate, String returnDate) {
        if(student != null && book != null) {
            model.registerLoan(student, book, loanDate, returnDate);
            return;
        }
        if(student == null) {
            registerLoanForm.getStudentAlertLabel().setText("Student not found");
        }
        else {
            registerLoanForm.getStudentAlertLabel().setText("");
        }
        if(book == null) {
            registerLoanForm.getBookAlertLabel().setText("Book not available");
        }
        else {
            registerLoanForm.getBookAlertLabel().setText("");
        }
    }


    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void saveBtnClicked() {
        if(correctInfo()) {
            Student student = model.searchStudent(registerLoanForm.getStudentTxt().getText());
            Book book = model.searchBook(registerLoanForm.getBookTxt().getText());
            String loanMonth = registerLoanForm.getLoanMonthTxt().getText();
            String loanDay = registerLoanForm.getLoanDayTxt().getText();
            String loanYear = registerLoanForm.getLoanYearTxt().getText();
            String loanDate = loanMonth + " / " + loanDay + " / " + loanYear;
            String returnMonth = registerLoanForm.getReturnMonthTxt().getText();
            String returnDay = registerLoanForm.getReturnDayTxt().getText();
            String returnYear = registerLoanForm.getReturnYearTxt().getText();
            String returnDate = returnMonth + " / " + returnDay + " / " + returnYear;

            register(student, book, loanDate, returnDate);
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
