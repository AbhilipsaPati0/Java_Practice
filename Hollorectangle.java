import java.util.Scanner;

public class Hollorectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows and columns
        System.out.print(" rows: ");
        int rows = scanner.nextInt();
        System.out.print("columns: ");
        int columns = scanner.nextInt();

        // Printing hollow rectangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    // Print '*' for first row, last row, first column, last column
                    System.out.print("* ");
                } else {
                    // Print space for hollow part
                    System.out.print("  ");
                }
            }
            // Move to next line after each row is printed
            System.out.println();
        }

        scanner.close();
    }
}
