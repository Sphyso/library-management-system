Class: Book
   This class represents the individual items in your library.

Attributes:
    isbn: String (Unique identifier)
    title: String
    author: String
    isAvailable: Boolean

Methods:
    markAsBorrowed(): Updates availability to false.
    markAsReturned(): Updates availability to true.
    getDetails(): Returns a formatted string of book info.

Class: User (Abstract Base Class)
   This is the parent class for anyone interacting with the system, utilizing Inheritance.

Attributes:
    userId: String
    name: String
    email: String

Methods:
    displayProfile(): Shows user information.

Class: Member (Inherits from User)
   Represents a library patron who borrows books.

Attributes:
    borrowedBooks: List of Book objects
    maxLimit: Integer (Constant, e.g., 5)

Methods:
    borrowBook(Book): Adds a book to the list if the limit isn't reached.
    returnBook(Book): Removes the book from the list.

Class: Librarian (Inherits from User)
   Represents the staff who manage the inventory.

Methods:
    addBook(Book): Adds a new book to the library system.
    removeBook(isbn): Removes a book from the system.
    issueBook(Book, Member): Coordinates the transaction between a book and a member.

Class: Library (The System Controller)
   This class acts as the "brain" and contains the collections of data.

Attributes:
    books: List of Book
    members: List of Member

Methods:
    searchByTitle(String): Returns a list of books matching the title.
    findMemberById(String): Locates a member in the system.
    generateInventoryReport(): Summarizes total and available books.