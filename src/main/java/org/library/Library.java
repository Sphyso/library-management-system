package org.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public Library(Book book, Member member) {
        this.books.add(book);
        this.members.add(member);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> booksFound = new ArrayList<>();
        return booksFound;
    }

    public Member findMemberById(String id) {
        Member found = new Member();
        return found;
    }

    public void generateInventoryReport() {

    }

}