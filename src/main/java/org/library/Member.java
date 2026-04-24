package org.library;

import java.util.ArrayList;

public class Member extends User{

    private ArrayList<Book> borrowedBooks;
    private final int maxLimit = 5;

    public Member(String userId, String name, String email) {
        super(userId, name, email);
    }


    public void borrowBook(Book theBook) {
        if (borrowedBooks.size() < maxLimit) {
            this.borrowedBooks.add(theBook);
        } else {
            System.out.println("Limit for borrowing books has been reached.");
        }
    }

    public void returnBook(Book theBook) {
        if (borrowedBooks.contains(theBook)) {
            this.borrowedBooks.remove(theBook);
        } else {
            System.out.println("User has not borrowed this book.");
        }
    }
}