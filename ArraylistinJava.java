/*WAP on basic arraylist
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 30.09.2024
 */
import java.util.*;
class ArraylistinJava{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(); //creating arraylist
        list.add("Rahul"); //adding object in array list
        list.add("Vijay");
        list.add("Ajay");
        //traversing list through iterators
        Iterator itr=list.iterator(); 
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}