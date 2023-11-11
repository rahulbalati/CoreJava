interface one{                          // we can have default and static methods
default void  someMethod(){
System.out.println("it is default method");
}
static void anotherMethod(){
    System.out.println("static method");
}
}
interface two{                                 //if we create two same implementation of default method it shows duplicate
// default void  someMethod(){
// System.out.println("it is default method");
// }
static void anotherMethod(){
    System.out.println("static method");
}
}

public class defaultStaticInterface  implements one,two{
    public static void main(String[] args) {
        defaultStaticInterface d=new defaultStaticInterface();
        d.someMethod();
        one.anotherMethod();
       
       

        
    }
}
