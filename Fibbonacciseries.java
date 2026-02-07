/*
 * WAP to findout Fibbonacci Series.
 * Name- Abhilipsa Pati
 * Regn No- 230301120502
 * Date-10.08.2024
 */
import java.util.Scanner;
public class Fibbonacciseries{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter nmber:"); 
        int n=s.nextInt();

        int a=0, b=1;
        System.out.println(a+" "+b+" ");
        for(int i=2; i<n; i++){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        s.close();
    }
}