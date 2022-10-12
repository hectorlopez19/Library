package model;

import java.util.Arrays;

public class Model {
    private User[] users;
    private int registeredUsers;
    private Stack<Student> students;
    private Stack<Book> books;
    private Stack<Loan> loans;

    public Model() {
        this.users = new User[0];
        this.registeredUsers = 0;
        this.students = new Stack<Student>();
        this.books = new Stack<Book>();
        this.loans = new Stack<Loan>();
    }

    // -------------------------------------------------- Getters and Setters --------------------------------------------------
    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public int getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(int registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public Stack<Student> getStudents() {
        return students;
    }

    public void setStudents(Stack<Student> students) {
        this.students = students;
    }

    public Stack<Book> getBooks() {
        return books;
    }

    public void setBooks(Stack<Book> books) {
        this.books = books;
    }

    public Stack<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Stack<Loan> loans) {
        this.loans = loans;
    }

    // -------------------------------------------------- Login --------------------------------------------------
    public int searchUser(String target) {
        for(int i = 0; i < registeredUsers; i++) {
            if(users[i].getUsername().equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public User loginUser(int index, String password) {
        if(users[index].getPassword().equals(password)) {
            return users[index];
        }
        return null;
    }

    // -------------------------------------------------- Sign Up --------------------------------------------------
    public void registerUser(String username, String password) {
        int n = users.length;
        User[] newArray = Arrays.copyOf(users, n + 1);
        setUsers(newArray);
        users[registeredUsers] = new User(username, password);
        registeredUsers++;
    }

    // -------------------------------------------------- Register Student --------------------------------------------------
    public Student searchStudent(String id) {
        for(int i = 0; i < students.length(); i++) {
            if(students.valueOf(i).getId().equals(id)) {
                return students.valueOf(i);
            }
        }
        return null;
    }

    public void registerStudent(String name, String id, String career, int grade) {
            students.push(new Student(name, id, career, grade));
    }

    // -------------------------------------------------- Register Book --------------------------------------------------
    public Book searchBook(String id) {
        for(int i = 0; i < books.length(); i++) {
            if(books.valueOf(i).getId().equals(id)) {
                return books.valueOf(i);
            }
        }
        return null;
    }

    public void registerBook(String title, String author, String edition, String id) {
        books.push(new Book(title, author, edition, id));
    }

    // -------------------------------------------------- Register Loan --------------------------------------------------
    public void registerLoan(Student student, Book book, String loanDate, String returnDate) {
        loans.push(new Loan(student, book, loanDate, returnDate));
    }
}
