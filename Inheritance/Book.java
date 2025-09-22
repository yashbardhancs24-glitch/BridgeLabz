class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
class Author extends Book {
    private String name;

    public Author(String title, int publicationYear, String name) {
        super(title, publicationYear);
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + name);
        System.out.println("Published: " + publicationYear);
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Author authoredBook = new Author("1984", 1949, "George Orwell");
        authoredBook.displayInfo();
    }
}