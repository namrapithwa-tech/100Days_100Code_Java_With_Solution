// WAP to find whether a number is Odd or Even without using a % operator.

import java.util.Scanner;

public class program9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even using bitwise AND
        if ((number & 1) == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
