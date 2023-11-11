import java.util.*;

public class Hashset0001 {
   public static void main(String[] args) {
    HashSet<Integer> hs=new HashSet<>();
    hs.add(7);
    hs.add(2);
    hs.add(1);
    hs.add(3);
   
    HashSet<String> h=new HashSet<>();
    h.add("rahul");
    h.add("billionare");
    h.add(null);           //it can add atleast one null value
     HashSet<Integer> has=new HashSet<>();
    has.add(1);
    has.add(5);
    has.add(4);
    has.add(3);
    


    Set<Integer> union = new HashSet<Integer>(hs); 
    union.addAll(has);           //can't  add strings to integer
    System.out.println(h);

    //.retainAll(has)  gives the common elements in both array

    //.removeAll gives difference 

    
   } 
}
