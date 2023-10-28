class PrinterDemo extends Thread{
    private static final Object lock=new Object();
  synchronized  public void run(){
          String name=Thread.currentThread().getName();
          synchronized (lock){      
            System.out.println(name+" "+"is started printing");
          for(int i=1;i<=3;i++){
            System.out.println(name+" "+"is currently printing");
        try{
                Thread.sleep(1100);
            }catch(Exception e){
                System.out.println("some exception occurred");
            }
          }
        
          System.out.println(name+" "+" completed printing");
        }
    }
  


}

public class printer {
    public static void main(String[] args) {
        PrinterDemo p1=new PrinterDemo();
        PrinterDemo p2=new PrinterDemo();
        PrinterDemo p3=new PrinterDemo();
        p1.setName("rahul");
        p2.setName("sweta");
        p3.setName("soumya");
        p1.start();
        p2.start();
        p3.start();
    }
}
