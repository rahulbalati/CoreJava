interface A{
  default  void someMethod(){
    System.out.println("method belongs to A");
  }
  void cricket();
}
interface B{
default void someMethod(){
    System.out.println("method belongs to B");
   
} void cricket();
}
/*public class multipleInheritance implements A,B {            same method but different body returns duplicate
    public static void main(String[] args) {
        
    }
}
*/