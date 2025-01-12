
// WAP to find a total odd and total even digit of a given number.
import java.util.Scanner;

public class progrma8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variables to count odd and even digits
        int oddCount = 0;
        int evenCount = 0;

        // Process each digit
        int temp = Math.abs(number); // Use absolute value to handle negative numbers
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            if (digit % 2 == 0) {
                evenCount++; // Increment even digit count
            } else {
                oddCount++; // Increment odd digit count
            }
            temp /= 10; // Remove the last digit
        }

        // Output the results
        System.out.println("Total even digits: " + evenCount);
        System.out.println("Total odd digits: " + oddCount);

        scanner.close();
    }
}
