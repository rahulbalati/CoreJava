public class glass {
   static void sum() throws ArithmeticException{
        try{
           int a=10;
           int b=0;
           int c=a/b;
           System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        glass.sum();
    }
}
