package org.library;

public class Main {
    public static void main(String[] args) {
        Member john = new Member("001", "John Doe", "johndoe@email.com");
        Member cench = new Member("002", "Central Cee", "cench@email.com");
        Member george = new Member("003", "George Russel", "russel@email.com");
        //john.displayProfile();

        Book book1 = new Book("FDCAP", "Crime and Punishment", "Fyodor Dostoevsky", true);
        Book book2 = new Book("HLTKAMB", "To Kill a Mockingbird", "Harper Lee", true);
        Book book3 = new Book("RBT48LOP", "The 48 Laws of Power", "Robert Greene", true);

        book1.getDetails();
        book2.getDetails();
        book3.getDetails();

        Librarian librarian = new Librarian(john.getUserId(), john.getName(), john.getEmail());




    }
}