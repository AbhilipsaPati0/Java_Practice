import java.util.Scanner;

public class invertedpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("Enter number of rows for the inverted pyramid: ");
        int rows = scanner.nextInt();

        // Printing inverted half pyramid pattern
        for (int i = rows; i >= 1; i--) {
            // Print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        scanner.close();
    }
}
