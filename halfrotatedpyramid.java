import java.util.Scanner;

public class halfrotatedpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print(" rows for the inverted rotated half pyramid: ");
        int rows = sc.nextInt();

        // Printing inverted rotated half pyramid pattern
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  "); // two spaces for better alignment
            }
            // Print '*' in each row
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        sc.close();
    }
}
