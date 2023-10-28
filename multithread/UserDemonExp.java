class Demo1 extends Thread{
    public void run(){
        
        for(int i=1;i<=5;i++){
            System.out.println("user threads running");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("some exception occured");
            }
        }
        System.out.println("user thread excution completed");
    }

}
class Demo2 extends Thread{
    public void run(){
        for(;;){
            System.out.println("demon thread excecuting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
               System.out.println("some problem occurred");
            }
        }

    }
}


public class UserDemonExp {
    public static void main(String[] args) {
        System.out.println("main thread executing");
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d2.setDaemon(true);
        d1.start();
        d2.start();
        System.out.println("main thread execution completed");
    }
}
