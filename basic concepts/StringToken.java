import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String s="Rahul is a bad boy";
        StringTokenizer stk=new StringTokenizer(s," ");
        while(stk.hasMoreTokens()){
            System.out.println(stk.nextToken());
        }

    }
}
