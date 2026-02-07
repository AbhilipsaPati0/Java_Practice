import java.util.Scanner;

public class solidrhombus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("number of rows: ");
        int rows = s.nextInt();

        // Upper part of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars for each row
            for (int j = 1; j <= rows; j++) {
                System.out.print("* 5");
            }
            System.out.println();
        }

        s.close();
    }
}
