/*WAP to print floydtable.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 12.08.2024
 */
import java.util.Scanner;
public class floydtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for number of rows
        System.out.print("Enter number of rows for Floyd's triangle: ");
        int rows = scanner.nextInt();
        int number = 1;

        // Printing Floyd's triangle pattern
        for (int i = 0; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        scanner.close();
    }
}
