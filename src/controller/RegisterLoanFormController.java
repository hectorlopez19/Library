package controller;

import model.Book;
import model.Model;
import model.Student;
import view.RegisterBookForm;
import view.RegisterLoanForm;

import java.awt.event.KeyEvent;

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
            registerLoanForm.getReturnDateAlertLabel().setText("Invalid return date");
            correct = false;
        }
        else {
            registerLoanForm.getReturnDateAlertLabel().setText("");
            correct = true;
        }
        return correct;
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

            if(student != null && book != null) {
                model.registerLoan(student, book, loanDate, returnDate);
                end();
                HomeController.start();
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
    }

    public static void cleanBtnClicked() {
        reset();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }

    // -------------------------------------------------- Text Fields --------------------------------------------------
    public static boolean isSpecial(char character) {
        if(character == KeyEvent.VK_ENTER || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean correctNumber(char character) {
        if((character < '0' || character > '9') && !isSpecial(character)) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean size2(int size) {
        if(size >= 2) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void correctLoanDay(KeyEvent e) {
        char character = e.getKeyChar();
        int size = registerLoanForm.getLoanDayTxt().getText().length();
        if(!correctNumber(character) || !size2(size)) {
            registerLoanForm.getToolkit().beep();
            e.consume();
        }
    }
    public static void correctReturnDay(KeyEvent e) {
        char character = e.getKeyChar();
        int size = registerLoanForm.getReturnDayTxt().getText().length();
        if(!correctNumber(character) || !size2(size)) {
            registerLoanForm.getToolkit().beep();
            e.consume();
        }
    }
    public static void correctLoanMonth(KeyEvent e) {
        char character = e.getKeyChar();
        int size = registerLoanForm.getLoanMonthTxt().getText().length();
        if(!correctNumber(character) || !size2(size)) {
            registerLoanForm.getToolkit().beep();
            e.consume();
        }
    }
    public static void correctReturnMonth(KeyEvent e) {
        char character = e.getKeyChar();
        int size = registerLoanForm.getReturnMonthTxt().getText().length();
        if(!correctNumber(character) || !size2(size)) {
            registerLoanForm.getToolkit().beep();
            e.consume();
        }
    }
}
