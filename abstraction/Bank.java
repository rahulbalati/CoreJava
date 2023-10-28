import java.util.Scanner;
abstract class Atm1{
    abstract void deposit();
    abstract void withdraw();

}
class Atm extends Atm1{
    Scanner sc=new Scanner(System.in);
   private  int balance;
   private String user="rahul";
   private int pin=13;
   
   Atm(int balance){
    this.balance=balance;
    System.out.println("initial balance:"+balance);

   }
    void deposit(){
        System.out.println("enter amount to deposit");
        int amount=sc.nextInt();
        if(amount>0){
            System.out.println("deposit succesfull");

            balance+=amount;
            System.out.println("cuur balance : "+balance);
        }else{
            System.out.println("re-enter corectly");
            amount=sc.nextInt();
        }
    }
    void withdraw(){
        System.out.println("enter username ");
            String username=sc.next();
             System.out.println("enter password ");
             int pass=sc.nextInt();

        if(user.equals(username) && pass==pin){
        System.out.println("enter amount to withdraw");
        int withdraw=sc.nextInt();
        if(withdraw>0 && withdraw<balance){
            System.out.println("withdraw successfull");
            balance=balance-withdraw;
            System.out.println(balance);
           
        }
        else{
            System.out.println("insufficient funds");
        }
    }else{
        System.out.println("invalid username or password");
    }

        
    }
}
class Bank{
    public static void main(String[] args) {
        Atm a=new Atm(100);
        a.deposit();
     
    }

}