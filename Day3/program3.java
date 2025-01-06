
// WAP to find a Factor of a given number (iterative and recursive)
import java.util.*;

public class program3 {

    // Iterative method
    public static void findFactorsIterative(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Recursive method
    public static void findFactorsRecursive(int number, int divisor) {
        if (divisor > number) {
            return;
        }
        if (number % divisor == 0) {
            System.out.print(divisor + " ");
        }
        findFactorsRecursive(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Iterative method
        System.out.println("Factors of " + number + " (Iterative):");
        findFactorsIterative(number);

        // Recursive method
        System.out.println("Factors of " + number + " (Recursive):");
        findFactorsRecursive(number, 1);

        scanner.close();
    }
}
