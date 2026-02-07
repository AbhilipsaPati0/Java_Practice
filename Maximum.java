import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();

        double maxNum;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }

        System.out.println("The maximum number is: " + maxNum);
    }
}