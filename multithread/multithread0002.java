class Multithread extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+currentThread().getId()+" is running ");
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("exception is caught");
        }
    }
}
public class multithread0002 {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            Multithread m=new Multithread();
            m.start();
        }

        
    }
    
}
