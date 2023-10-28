public class DeadlockingMain {
    public static void main(String[] args) {
        try{
            System.out.println("entering the deadlock");
            Thread.currentThread().join();

            System.out.println("this will never execute");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
