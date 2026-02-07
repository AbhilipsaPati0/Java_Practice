import java.util.Scanner;

public class pallindromicpyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" number of rows : ");
        int rows = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers increasing from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print numbers decreasing from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}
