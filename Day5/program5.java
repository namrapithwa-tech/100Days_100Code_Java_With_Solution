import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number to find the summation of its digits: ");
        int number = scanner.nextInt();

        // Iterative method
        System.out.println("Sum of digits (Iterative): " + sumOfDigitsIterative(number));

        // Recursive method
        System.out.println("Sum of digits (Recursive): " + sumOfDigitsRecursive(number));

        scanner.close();
    }

    // Iterative method to find the sum of digits
    public static int sumOfDigitsIterative(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;           // Add it to the sum
            number /= 10;           // Remove the last digit
        }
        return sum;
    }

    // Recursive method to find the sum of digits
    public static int sumOfDigitsRecursive(int number) {
        number = Math.abs(number); // Handle negative numbers
        if (number == 0) {
            return 0; 
        }
        return (number % 10) + sumOfDigitsRecursive(number / 10); 
    }
}
