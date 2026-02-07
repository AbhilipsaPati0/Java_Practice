import java.util.Scanner;
public class multiplenumberhalfpyramid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = s.nextInt(); 

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println(); // Move to the next line after each row
        }
        s.close();
    }
}
