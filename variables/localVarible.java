public class localVarible {
    public static void main(String[] args) {
        int a=5;             //local variables declared within methods stored within stack segment
        float b =5.5f; //bydefault stores double value
        boolean c=false;
        System.out.println(a);           //can't print local variable without assigning values genrally has garbage value
        System.out.println(b);
        System.out.println(c);


    }
}
