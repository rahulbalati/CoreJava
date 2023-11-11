import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class queue0001 {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        Queue<Integer> pbq
            = new PriorityBlockingQueue<Integer>();    //thread-safe implementation 
          
            System.out.println(q);
             q.remove();
             System.out.println(q);    //gives runtime error if empty
           
            q.poll();        //used to remove element  if empty returns null
            System.out.println(q);  
            
          //add method returns exception if unable to add
          //offer method returns true or false 


            
        }
    }

