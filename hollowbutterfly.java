import java.util.Scanner;
public class hollowbutterfly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int n= s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print("*");
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        s.close();
    }
}
