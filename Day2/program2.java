
// WAP to find whether string is palindrome or not.
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean the string by removing non-alphanumeric characters and converting to
        // lowercase
        String cleanedStr = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleanedStr += Character.toLowerCase(ch);
            }
        }

        // Manually reverse the cleaned string
        String reversedStr = "";
        for (int i = cleanedStr.length() - 1; i >= 0; i--) {
            reversedStr += cleanedStr.charAt(i);
        }

        // Check if the cleaned string is equal to its reversed version
        boolean isPalindrome = true;
        for (int i = 0; i < cleanedStr.length(); i++) {
            if (cleanedStr.charAt(i) != reversedStr.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}