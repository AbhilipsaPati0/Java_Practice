import java.util.Scanner;

public class BinaryandAscii2{
    public static void printBinary(char c) {
        for (int i = 7; i >= 0; i--) {
            int m = 1 << i;
            System.out.print((c & m) == m ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("ASCII equivalent: " + (int) c);
        System.out.print("Binary equivalent: ");
        printBinary(c);
    }
}