public class Increment {
   public static void main(String args[]){
    int a=5;int d=5;
    int b;
    b=++a + ++a;      // pre-increment value first incremented i.e ++a=6
    System.out.println(b);

    int c;
    c=d++ + d++;     //post-increment value first used i.e d++=5
    System.out.println(c);
   } 
}
