public class DivisionDemo {
    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }}
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        divideNumbers(numerator, denominator);
    }
}
