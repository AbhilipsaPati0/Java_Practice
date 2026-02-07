import java.util.Scanner;
public class diamond{
    public static void main(String[] args){
        Scanner s= new Scanner (System.in);
        System.out.print("Enter row number:");
        int rows= s.nextInt();
        
        //upper half 
        for (int i=1; i<=rows; i++){
            //spaces
            for (int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half 
        for (int i=rows ; i>=1; i--){
            //spaces
            for (int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();

    }
}