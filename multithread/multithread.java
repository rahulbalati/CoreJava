
import java.util.Scanner;

class Task1 extends Thread{
    Task1(){
        start();
    }
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        String nam=sc.next();
        System.out.println("enter the password");
        String pass=sc.next();
    }
}
class Task2 extends Thread{
    Task2(){
        start();
    }
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
class Task3 extends Thread{
    Task3(){
        start();
    }public void run(){
        int a=100;
        int b=200;
        int c=a+b;
        System.out.println(c);

    }
}


public class multithread {
    public static void main(String[] args) {
        Task1 t1=new Task1();
      
      
        Task2 t2=new Task2();
       
        Task3 t3=new Task3();
    
        
    }
}
