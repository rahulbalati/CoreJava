class printerdemo1 implements Runnable{
  public void run(){
        String name=Thread.currentThread().getName();
        System.out.println(name+" "+" is started printing");
        for(int i=1;i<=3;i++){
            System.out.println(name+" "+"is currently printing");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("some mistake occured");
            }

        }
        System.out.println(name+" "+"completed printing");
    }
}
public class printerExp {
    public static void main(String[] args) {
        printerdemo1 p1=new printerdemo1();
        
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p1);
        Thread t3=new Thread(p1);
        t1.setName("rahul");
        t2.setName("soumya");
        t3.setName("swetha");
       
        try {
            t1.start();
            t1.join();                          //join compulsary placed within try catch block
            t2.start();
            t2.join(); t3.start();
        } catch (InterruptedException e) {
            System.out.println("some error occured");
        }
        
       
    }
    
}
