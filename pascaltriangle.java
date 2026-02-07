/*WAP to print pascal Triangle.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 12.08.2024
 */
import java.util.Scanner;
public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("the number of rows for Pascal's Triangle: ");
        int nums = sc.nextInt();
        
        // Calculate and print Pascal's Triangle
        for (int i = 0; i < nums; i++) {
            // Print spaces for alignment
            for (int j = 0; j < nums - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Initialize first element of each row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                // Print current number in the row
                System.out.print(number + " ");
                
                // Calculate next number using the current number
                number = number * (i - j) / (j + 1);
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
        
        sc.close();
    }
}
