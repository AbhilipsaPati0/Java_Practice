import java.util.Scanner;
public class BinaryandAscii{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = s.next().charAt(0);
        int ascii = ch;
        String binary = Integer.toBinaryString(ascii);

        System.out.println("The ASCII value of '" + ch + "' is " + ascii);
        System.out.println("The binary value of '" + ch + "' is " + binary);
    }
}