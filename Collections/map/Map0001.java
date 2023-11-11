import java.util.*;
public class Map0001 {
    public static void main(String[] args) {
        HashMap<Integer,String>  hs=new HashMap<>();
        hs.put(1, "rahul");          //no add method
        hs.put(2, "balati");
        hs.put(3,"billion");
       
      for(Map.Entry<Integer,String> me:hs.entrySet()){
        System.err.println(me.getKey());
        System.out.println(me.getValue());
      }
    }
}
