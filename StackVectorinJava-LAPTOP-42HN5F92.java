/*WAP on stack in arraylist.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 30.09.2024
 */
import java.util.*;
public class StackVectorinJava{
    public static void main(String[] args){
        Stack<String> stack= new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Anshish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr= stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}