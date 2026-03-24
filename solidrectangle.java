// This program prints a solid rectangle of asterisks based on user input for rows and columns.
// by Abhilipsa
// in practice of Java programming.
import java.util.Scanner;

public class solidrectangle
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("3columns: ");
        int columns = scanner.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
        
        scanner.close();
    }
}

