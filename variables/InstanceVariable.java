
public class InstanceVariable {
    static int a;               //instance variables declared within class has default values 
    static float b;             //gets created insidde heap memory and object refernce i.e i is stored in stack 
   static  boolean c;
    public static void main(String args[]){
        InstanceVariable i=new InstanceVariable();  //object creation 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
