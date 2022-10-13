package controller;

import model.Book;
import model.Model;
import model.Student;
import view.BookInfo;

public class BookInfoController {
    public static BookInfo bookInfo = new BookInfo("Books info");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        bookInfo.setSize(1000, 600);
        bookInfo.setLocationRelativeTo(null);
        bookInfo.setVisible(true);
        reset();
        showBooks();
    }

    public static void end() {
        bookInfo.setVisible(false);
    }

    public static void reset() {
        bookInfo.getTitleLabel().setText("");
        bookInfo.getAuthorLabel().setText("");
        bookInfo.getEditionLabel().setText("");
        bookInfo.getIdLabel().setText("");
        bookInfo.getBooksList().clearSelection();
        bookInfo.getBooksList();
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static String[] strBooks() {
        String[] books = new String[model.getBooks().length()];
        for(int i = 0; i < books.length; i++) {
            Book actualBook = model.getBooks().valueOf(i);
            books[i] = actualBook.getId() + "   " + actualBook.getTitle();
        }
        return books;
    }

    public static void showBooks() {
        if(model.getBooks().length() > 0 ) {
            bookInfo.getBooksListPanel().setVisible(true);
            bookInfo.getBooksInfoPanel().setVisible(true);
            bookInfo.getEmptyInfoLabel().setVisible(false);
            bookInfo.getBooksList().setListData(strBooks());
        }
        else {
            bookInfo.getBooksListPanel().setVisible(false);
            bookInfo.getBooksInfoPanel().setVisible(false);
            bookInfo.getEmptyInfoLabel().setVisible(true);
        }
    }

    public static void showBookInfo(Book book) {
        bookInfo.getTitleLabel().setText("Title: " + book.getTitle());
        bookInfo.getAuthorLabel().setText("Author: " + book.getAuthor());
        bookInfo.getEditionLabel().setText("Edition: " + book.getEdition());
        bookInfo.getIdLabel().setText("Id: " + book.getId());
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void bookSelected() {
        int index = bookInfo.getBooksList().getSelectedIndex();
        showBookInfo(model.getBooks().valueOf(index));
    }

    public static void cleanBtnClicked() {
        reset();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }

}
