import java.util.ArrayList;
import java.util.List;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) { super(message); }
}
class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) { super(message); }
}
class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) { super(message); }
}

class Library {
    private final List<String> availableBooks = new ArrayList<>(List.of("Java Programming", "OOP Concepts", "Data Structures"));
    private final List<String> borrowedBooks = new ArrayList<>();
    private static final int MAX_BOOKS = 2;

    public void borrowBook(String bookTitle) 
            throws BookNotAvailableException, UserLimitExceededException {

        if (borrowedBooks.size() >= MAX_BOOKS) {
            throw new UserLimitExceededException("User Limit Exceeded: Cannot borrow more than " + MAX_BOOKS + " books.");
        }
        
        if (!availableBooks.contains(bookTitle)) {
            throw new BookNotAvailableException("Book Not Available: '" + bookTitle + "' is currently checked out.");
        }

        availableBooks.remove(bookTitle);
        borrowedBooks.add(bookTitle);
        System.out.println("Successfully borrowed: " + bookTitle);
    }

    public void returnBook(String bookTitle) throws InvalidReturnException {
        if (!borrowedBooks.contains(bookTitle)) {
            throw new InvalidReturnException("Invalid Return: You did not borrow '" + bookTitle + "'.");
        }

        borrowedBooks.remove(bookTitle);
        availableBooks.add(bookTitle);
        System.out.println("Successfully returned: " + bookTitle);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBook("Java Programming");
            library.borrowBook("OOP Concepts");
            library.borrowBook("Data Structures");
        } catch (BookNotAvailableException e) {
            System.err.println("Borrowing Error: " + e.getMessage());
        } catch (UserLimitExceededException e) {
            System.err.println("Borrowing Error: " + e.getMessage());
        }

        try {
            library.returnBook("Non-Borrowed Book");
        } catch (InvalidReturnException e) {
            System.err.println("Returning Error: " + e.getMessage());
        }
    }
}