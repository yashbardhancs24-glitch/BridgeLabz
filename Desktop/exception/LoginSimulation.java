class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "12345";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!VALID_USER.equals(user) || !VALID_PASS.equals(pass)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
        System.out.println("Login successful! Welcome, " + user);
    }
}

public class LoginSimulation {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        String userAttempt = "user1";
        String passAttempt = "wrongpass";

        try {
            login.validate(userAttempt, passAttempt);
        } catch (InvalidCredentialsException e) {
            System.err.println("Login Failed: " + e.getMessage());
            System.out.println("Please check your credentials and try again.");
        }
    }
}