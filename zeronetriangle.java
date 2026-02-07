import java.util.Scanner;

public class zeronetriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("Enter number of rows for the 0-1 triangle: ");
        int rows = scanner.nextInt();

        // Printing 0-1 triangle pattern
        for (int i = 1; i <= rows; i++) {
            
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                int sum =  i+j;
                if(sum % 2  ==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        scanner.close();
    }
}
