/*
 * Program name- Program to check whether the entered char is vowel or not.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 03/08/2024
 */
import java.util.Scanner;
public class Vowel{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter an alphabet:");
        char alphabet = s.next().charAt(0);
        //switch statement
        switch(alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                   System.out.println(alphabet +" is vowel");
                   break;
            default:
                if(Character.isLetter(alphabet)){
                    System.out.println(alphabet+ " is consonant");
                }else{
                    System.out.println("Invalid input");
                }
        }
    }
}