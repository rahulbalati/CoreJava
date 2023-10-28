import java.util.Scanner;

public class properExceptioHandling {
    void fun2() throws ArithmeticException{
        System.out.println("connection 2 is established");
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter numerator");
            int a=sc.nextInt();
            System.out.println("enter denominator");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
            System.out.println();
            
        }catch(Exception e){
            System.out.println("handled inside function 2");
            throw e;
        }
        finally{
            System.out.println("connection 2 is terminated");
        }

    }
    
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        properExceptioHandling p=new properExceptioHandling();
        try{
            p.fun2(); 
        }catch(Exception e){
            System.out.println("handled inside main");

        }System.out.println("connection 1 is terminated");
       
        
    }
}
