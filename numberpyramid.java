import java.util.Scanner;

public class numberpyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number of rows : ");
        int rows = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces before numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}
