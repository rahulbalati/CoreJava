

class A{
    int i;
    class B{
        int j;
    }
}

public class Inner {
   public static void main(String args[]){
    A a=new A();
   A.B b=a.new B();
   b.j=5;
   System.out.println(b.j);


   }

 

}
