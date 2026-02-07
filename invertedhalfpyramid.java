import java.util.Scanner;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("Enter number of rows for the inverted number half pyramid: ");
        int rows = scanner.nextInt();

        // Printing inverted number half pyramid pattern
        for (int i = rows; i >= 1; i--) {
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
