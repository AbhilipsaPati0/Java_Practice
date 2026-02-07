/*WAP on linkedlist  in Arraylist.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 30.09.2024
 */
import java.util.*;
public class LinkedListinJavaArraylist{
    public static void main(String[] args){
        LinkedList<String> al= new LinkedList<String>();
        al.add("Rahul");
        al.add("Vijay");
        al.add("Rahul");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}