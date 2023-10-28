class Hospital extends Thread{
    Hospital(String name){
        super(name);

    }
    public void run(){
        if(getName().equals("doctor")){
           doctor();

        }else{
            nurse();
        }
    }
    void doctor(){
        for(int i=1;i<=3;i++){
        System.out.println("doctor is treating patient");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    }
    void nurse(){
        for(;;){
            System.out.println("nurse is helping doctor");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
public class Demon1 {
    public static void main(String[] args) {
        Hospital h1=new Hospital("doctor");
        Hospital h2=new Hospital("nurse");
        h1.start();
        h2.setDaemon(true);
        h2.start();
        
    }
}
