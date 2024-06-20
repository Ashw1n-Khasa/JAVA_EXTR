// Custom exception class extending Exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Example scenario where custom exception is thrown
            int age = 17;
            if (age < 18) {
                throw new CustomException("Age must be 18 or above to proceed.");
            }
        } catch (CustomException e) {
            // Catching and handling the custom exception
            System.out.println("Custom Exception Caught: " + e.getMessage());
            // You can also log the exception or perform other actions here
        }
    }
}
