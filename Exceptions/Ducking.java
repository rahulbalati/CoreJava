
class Demo{
    void fun1(){
        fun2();

    }void fun2() throws ArithmeticException{
        int a=10;
        int b=0;
        int c;
        c=a/b;
    }

}

public class Ducking {
    public static void main(String[] args) {
        System.out.println("entering mains method");
        Demo d=new Demo();
        try{
            d.fun1();
        }catch(Exception e){
            System.out.println("exception ");
        }
        System.out.println("exiting main normally");
        
    }
}
