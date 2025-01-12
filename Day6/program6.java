// Print a following pattern
// 1
// 1 2
// 1 2 3
// 1 2 3 4
public class program6 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(j + " "); // Print the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
