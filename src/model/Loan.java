package model;

public class Loan {
    private Student student;
    private Book book;
    private String loanDate;
    private String returnDate;

    public Loan(Student student, Book book, String loanDate, String returnDate) {
        this.student = student;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
