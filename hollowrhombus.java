import java.util.Scanner;

public class hollowrhombus{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" number of rows : ");
        int rows = sc.nextInt();

        // Upper part of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars or spaces for each row
            if (i == 1 || i == rows) {
                // Print all stars for the first and last row
                for (int j = 1; j <= rows; j++) {
                    System.out.print("* ");
                }
            } else {
                // Print stars and spaces for other rows
                System.out.print("* "); // Left edge
                for (int j = 1; j <= rows - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* "); // Right edge
            }

            System.out.println();
        }

        sc.close();
    }
}
