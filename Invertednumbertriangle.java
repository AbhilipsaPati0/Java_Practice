import java.util.Scanner;
public class Invertednumbertriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter row number:");
        int rows =s.nextInt(); 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        s.close();
    }
}
