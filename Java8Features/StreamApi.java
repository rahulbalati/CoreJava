import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


 

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        for(int i=1;i<=100;i++){
            lst.add(i);
        }
        //if we want sum of numbers greater than 90 we use stream
        //it is basically used to perform operations on Bulk data of collections

        //It has map/reduce/filter methods to perform operations

        // NOTE;-stream doesnot store any value
        // Intermediate Operations: These operations (like map, filter, sorted, etc.) transform one stream into another. They are lazy, meaning they do not process elements until a terminal operation is invoked.

        //Terminal Operations: These operations (like forEach, collect, reduce, etc.) produce a result or a side-effect. When a terminal operation is invoked, the stream is processed, and the result is obtained.

        //sequential stream
        Stream<Integer> sequentialStream=lst.stream();
        Stream<Integer> NoSeq=sequentialStream.filter(p->p>90);
        NoSeq.forEach(a->System.out.println(a));
        System.out.println("----------------------------------------------------");

        //parallel Stream
        Stream<Integer> parallelStream=lst.parallelStream();
        Stream<Integer> ParrNoSeq=parallelStream.filter(p->p>90);
        ParrNoSeq.forEach(a->System.out.println(a));

        //MAP 
        List<Integer> squaredNo=lst.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squaredNo);

        //Reduce
        int sum=lst.stream()
        .reduce(0, (acc,x)->acc+x);
        System.out.println(sum);

        //filter
        List<Integer> Nogreater90=lst.stream().filter(x->x>90).collect(Collectors.toList());
        System.out.println(Nogreater90);
    }
}
