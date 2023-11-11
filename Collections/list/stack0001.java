import java.util.*;
public class stack0001 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);      //used to add elements
        s.push(2);
       
        s.push(3);
       s.addLast(1);
                               //it can also have all methods of arraylist from inherited from vector

        System.out.println(s);
        System.out.println(s.peek());    //used to fetch element from top
        s.pop();                         //used to remove element from top
        System.out.println(s);

      System.out.println(s.search(1));       //count element from index 1 from top element 

    }
}
