
class bankaccount{
   private int bal;       //restricted access 

    public  void setBal(int x){         
        if(x>0)
        bal=x;
    }
    public int getBal(){
        return bal;
    }
}
public class EncapsulationBankAccount {
 
    public static void main(String[] args) {
       bankaccount e=new bankaccount();
       e.setBal(-1000);
      System.out.println( e.getBal());
    }
    
}