import java.util.ArrayList;

import java.util.List;

public class Feature1forEach {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            mylist.add(i);
        }

        // Iterator<Integer> it=mylist.iterator();          //normal iterator handled carefully otherwise shows concurrentModificationExample
        // while (it.hasNext()) {
        //     System.out.print(it.next()+" ");            
            
        // }
        mylist.forEach(game->{System.out.print(game+" ");}); //using forEach() Method by passing lambda expression
        mylist.forEach(System.out::println);        //by passing method reference
    }
}
