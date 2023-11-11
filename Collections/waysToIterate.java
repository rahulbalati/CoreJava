import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class waysToIterate {
    public static void main(String[] args) {
       List<Integer> a=new ArrayList<>();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
       a.add(5);
       System.out.println(a);

       //iterating using for-each loop
       for(int b:a){
        System.out.print(b+" ");
       }
       System.out.println();

       //iterating using iterator
       Iterator<Integer> itr=a.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }

       //iterating using list-iterator
       ListIterator Litr=a.listIterator(a.size());      //starts iterates based on given indes
       while(Litr.hasPrevious()){
        System.out.println(Litr.previous());          //can be iterated in backword direction
       }
       



    }
}
