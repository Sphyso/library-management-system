package org.library;

public class Librarian extends User {

    public Librarian(String userId, String name, String email) {
        super(userId, name, email);
    }

    public void addBook(Book book) {

    }

    public void removeBook(String isbn) {

    }

    public void issueBook(Book book, Member member) {

    }

    @Override
    public String ToString() {
        return "Name: " +this.getName()+ "Email: " +this.getEmail();
    }

}