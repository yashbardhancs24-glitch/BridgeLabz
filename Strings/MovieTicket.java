public class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor for an unbooked ticket
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Unassigned"; // Default value
        this.price = 0.0; // Default value
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + this.movieName);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("---- TICKET DETAILS ----");
        System.out.println("Movie: " + this.movieName);
        System.out.println("Seat: " + this.seatNumber);
        System.out.println("Price: $" + this.price);
        System.out.println("------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dune: Part Two");
        ticket.displayTicketDetails(); // Display before booking
        ticket.bookTicket("F12", 15.50);
        ticket.displayTicketDetails(); // Display after booking
    }
}