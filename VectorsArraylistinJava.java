/*WAP on Vectors in Arraylist.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 30.09.2024
 */
import java.util.*;
public class VectorsArraylistinJava{
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}