import java.util.*;

public class Arraylist0001{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();

        //to add element
        a.add(1); 
                //insertion order is preserved
        a.add(2);
        a.add(3);
        a.add(4);
        //adding based on index
        a.add(4,4); //can contain duplicates

        System.out.println(a);      //directly print

        a.set(1, 5);    //used to update value
        System.out.println(a);

       System.out.println( a.indexOf(4));   //returns first occurence
       System.out.println(a.lastIndexOf(4));  //returns last occurence

       a.remove(1);    //removes based on index
       System.out.println(a);
     

       a.remove(a.indexOf(3));   //removes object or element
       System.out.println(a);

       a.get(2);    //used to fetch data based on indes
       System.out.println(a.contains(4));     //used to check element is present or not

       ArrayList<Integer> b=new ArrayList<>();
       b.add(5);
       b.add(6);

       a.addAll(b);         //used to add all elements from one list to other 
       System.out.println(a);
       a.equals(b);          //used to check equality
       b.clear();
       System.out.println(b);

       b.ensureCapacity(20);       //to increase capacity from 10-20
       System.out.println(b);
       

    }
}