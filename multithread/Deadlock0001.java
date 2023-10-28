public class Deadlock0001 {
    private static final Object lock1=new Object();
    private static final Object lock2=new Object();

  static  class ThreadDeemo1 extends Thread{
        public void run(){
            synchronized(lock1){
                System.err.println("Thread 1: holding lock1");
                try{
                    Thread.sleep(1000);

                }catch(Exception e){};
                System.out.println("Thread 1:waiting for lock2");

                synchronized(lock2){
                    System.out.println("Thread 1:Holding lock1 & lock2");
                }
            }
        }
    }
   static  class ThreadDeemo2 extends Thread{
        public void run(){
            synchronized(lock2){               //just change the orders to release lock
                System.out.println("Thread 2 :holding lock2");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){};
                synchronized(lock1){
                    System.out.println("Thread 2:Holding lock1 & lock2");

                }
            }
        }
    }
    public static void main(String[] args) {
        ThreadDeemo1 d1=new ThreadDeemo1();
        ThreadDeemo2 d2=new ThreadDeemo2();
        d1.start();
        d2.start();
        
    }
}
