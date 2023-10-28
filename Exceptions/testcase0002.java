public class testcase0002 {
   static void  someMethod(){
   
    throw new RuntimeException();
   // System.out.println("dmash"); shows compilation error due to unreachable code
   
    }
    public static void main(String[] args) throws Exception {
        try{
            someMethod();
            System.out.println("b"); //any code after throw will not execute

        }/*catch(RuntimeException e){

        }*/
        finally{
            
        }
    }
}
