 import java.util.Scanner;

public class butterfly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" size of the wings : ");
        int size = sc.nextInt();

        // Upper part of the butterfly (wings)
        for (int i = 1; i <= size; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the two wings
            int spaces = 2 * (size - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly (wings)
        for (int i = size; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the two wings
            int spaces = 2 * (size - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
