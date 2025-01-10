import java.util.Scanner;

public class program7 {

    // Recursive method for Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method forFibonacci series
    public static void fibonacciIterative(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci series (Iterative): ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Iterative approach
        fibonacciIterative(n);

        // Recursive approach
        System.out.print("Fibonacci series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
