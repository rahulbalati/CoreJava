
import java.util.Scanner;

class Task1 implements Runnable{
    
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        String nam=sc.next();
        System.out.println("enter the password");
        String pass=sc.next();
    }
}
class Task2 implements Runnable{
    
    public void run(){
        
            try {for(int i=0;i<5;i++){
            System.out.println(i);
                Thread.sleep(5000);
            }
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        
    }
}
class Task3 implements Runnable{
   public void run(){
        int a=100;
        int b=200;
        int c=a+b;
        System.out.println(c);

    }
}

public class runnable {

    public static void main(String[] args) {
        Task1 t1=new Task1();
      
        Task2 t2=new Task2();
       
        Task3 t3=new Task3();
        Thread x=new Thread(t1);
        Thread y=new Thread(t2);
        Thread z=new Thread(t3);
        x.start();
        y.start();
        z.start();
    
        
    }
}


    

