import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public abstract int getLoanDuration();
    public void getItemDetails() { System.out.printf("%s: %s by %s. Loan days: %d%n", itemId, title, author, getLoanDuration()); }
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 21; }
    @Override public boolean reserveItem(String userId) { if(!available) return false; available=false; return true; }
    @Override public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 3; }
    @Override public boolean reserveItem(String userId) { if(!available) return false; available=false; return true; }
    @Override public boolean checkAvailability() { return available; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<LibraryItem> items = Arrays.asList(
                new Book("B001","Java Basics","A. Author"),
                new Magazine("M001","Tech Monthly","Editor"),
                new DVD("D001","Learning Java","Producer")
        );
        for(LibraryItem item: items) item.getItemDetails();
        if(items.get(0) instanceof Reservable){
            Reservable r = (Reservable)items.get(0);
            System.out.println("Reserve book: "+r.reserveItem("U100"));
            System.out.println("Available after reserve: "+r.checkAvailability());
        }
    }
}
