import java.util.Scanner;

public class numberhalfpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print(" rows for the number half pyramid: ");
        int rows = scanner.nextInt();

        // Printing number half pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        scanner.close();
    }
}
