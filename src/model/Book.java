package model;

public class Book {
    private String title;
    private String author;
    private String edition;
    private String id;

    public Book(String title, String author, String edition, String id) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
