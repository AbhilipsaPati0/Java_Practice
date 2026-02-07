import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Printing half pyramid pattern
        for (int i = 1; i <= rows; i++) {
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
