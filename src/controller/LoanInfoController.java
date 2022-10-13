package controller;

import model.Loan;
import model.Model;
import model.Student;
import view.LoanInfo;
import view.StudentInfo;

public class LoanInfoController {
    public static LoanInfo loanInfo = new LoanInfo("Loans info");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        loanInfo.setSize(1000, 600);
        loanInfo.setLocationRelativeTo(null);
        loanInfo.setVisible(true);
        reset();
        showLoans();
    }

    public static void end() {
        loanInfo.setVisible(false);
    }

    public static void reset() {
        loanInfo.getStudentNameLabel().setText("");
        loanInfo.getStudentIdLabel().setText("");
        loanInfo.getStudentCareerLabel().setText("");
        loanInfo.getStudentGradeLabel().setText("");

        loanInfo.getBookTitleLabel().setText("");
        loanInfo.getBookAuthorLabel().setText("");
        loanInfo.getBookEditionLabel().setText("");
        loanInfo.getBookIdLabel().setText("");

        loanInfo.getLoanDateLabel().setText("");
        loanInfo.getReturnDateLabel().setText("");

        loanInfo.getLoansList().clearSelection();
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static String[] strLoans() {
        String[] loans = new String[model.getLoans().length()];
        for(int i = 0; i < loans.length; i++) {
            Loan actualLoan = model.getLoans().valueOf(i);
            loans[i] = actualLoan.getStudent().getName() + "   " + actualLoan.getBook().getTitle();
        }
        return loans;
    }

    public static void showLoans() {
        if(model.getLoans().length() > 0 ) {
            loanInfo.getLoansInfoPanel().setVisible(true);
            loanInfo.getLoansListPanel().setVisible(true);
            loanInfo.getEmptyInfoLabel().setVisible(false);
            loanInfo.getLoansList().setListData(strLoans());
        }
        else {
            loanInfo.getLoansListPanel().setVisible(false);
            loanInfo.getLoansInfoPanel().setVisible(false);
            loanInfo.getEmptyInfoLabel().setVisible(true);
        }
    }

    public static void showLoanInfo(Loan loan) {
        loanInfo.getStudentNameLabel().setText("Name: " + loan.getStudent().getName());
        loanInfo.getStudentIdLabel().setText("ID: " + loan.getStudent().getId());
        loanInfo.getStudentCareerLabel().setText("Career: " + loan.getStudent().getCareer());
        loanInfo.getStudentGradeLabel().setText("Grade: " + loan.getStudent().getGrade());

        loanInfo.getBookTitleLabel().setText("Title: " + loan.getBook().getTitle());
        loanInfo.getBookAuthorLabel().setText("Author: " + loan.getBook().getAuthor());
        loanInfo.getBookEditionLabel().setText("Edition: " + loan.getBook().getEdition());
        loanInfo.getBookIdLabel().setText("Book ID: " + loan.getBook().getId());

        loanInfo.getLoanDateLabel().setText("Loan: " + loan.getLoanDate());
        loanInfo.getReturnDateLabel().setText("Return: " + loan.getReturnDate());
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void loanSelected() {
        int index = loanInfo.getLoansList().getSelectedIndex();
        showLoanInfo(model.getLoans().valueOf(index));
    }

    public static void cleanBtnClicked() {
        reset();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }
}
