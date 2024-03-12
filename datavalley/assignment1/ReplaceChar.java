import java.util.Scanner;
public class ReplaceChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the index of the character to replace: ");
        int index = scanner.nextInt();
        System.out.print("Enter the replacement character: ");
        char replacement = scanner.next().charAt(0);
        char[] charArray = str.toCharArray();
        if (index >= 0 && index < charArray.length) {
            charArray[index] = replacement;
            String modifiedStr = new String(charArray);
            System.out.println("Original String: " + str);
            System.out.println("String after replacing character at index " + index + ": " + modifiedStr);
        } else {
            System.out.println("Invalid index!");
        }
        scanner.close();
    }
}
