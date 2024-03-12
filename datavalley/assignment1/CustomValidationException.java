class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }}
public class CustomExceptionDemo {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
    public static void main(String[] args) {
        int number = -5;
        try {
            validateNumber(number);
            System.out.println("Number is positive: " + number);
        } catch (CustomValidationException e) {
            System.out.println("Caught CustomValidationException: " + e.getMessage());
        }
    }
}
