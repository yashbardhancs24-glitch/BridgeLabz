import java.util.ArrayList;
import java.util.List;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieBooking {
    private final List<String> availableSeats = new ArrayList<>(List.of("A1", "A2", "B1", "B2"));

    public void bookSeat(String seatNumber) 
            throws InvalidSeatException, SeatAlreadyBookedException {
        
        List<String> allSeats = List.of("A1", "A2", "B1", "B2", "C1", "C2");
        
        if (!availableSeats.contains(seatNumber) && !isBooked(seatNumber) && !allSeats.contains(seatNumber)) {
             throw new InvalidSeatException("Invalid Seat: The seat '" + seatNumber + "' does not exist in this theater.");
        }
        
        if (!availableSeats.contains(seatNumber) && isBooked(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat Already Booked: Seat '" + seatNumber + "' is unavailable.");
        }
        
        if (availableSeats.contains(seatNumber)) {
            availableSeats.remove(seatNumber);
            System.out.println("Seat '" + seatNumber + "' booked successfully.");
        }
    }

    private boolean isBooked(String seatNumber) {
        return List.of("A3", "B3").contains(seatNumber);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieBooking app = new MovieBooking();
        String invalidSeat = "Z9";

        try {
            app.bookSeat(invalidSeat);
        } catch (InvalidSeatException e) {
            System.err.println("Booking Failed: " + e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.err.println("Booking Failed: " + e.getMessage());
        }
    }
}