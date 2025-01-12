
// WAP to find a factorial of a given integer (iterative and recursive)
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " (Iterative): " + factorialIterative(number));

        System.out.println("Factorial of " + number + " (Recursive): " + factorialRecursive(number));

        scanner.close();
    }

    // Iterative method to find factorial
    public static long factorialIterative(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Recursive method to find factorial
    public static long factorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }
}
