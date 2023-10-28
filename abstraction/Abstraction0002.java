import java.util.Scanner;

abstract class Account{
    private int accountNo;
    private String holdername;
        int balance;
        int p=4321;
       
       
       
    Account(int accountNo,String holdername,int balance){
        this.accountNo=accountNo;
        this.holdername=holdername;
        this.balance=balance;
    }
    void Deposit(int deposit){
      if(deposit>0){
        balance=balance+deposit;
        System.out.println("deposit successfull");
      }

    }
    void withdraw(int withdraw){
        if(withdraw<balance){
            System.out.println("withdraw succesful");
            balance=balance-withdraw;
        }else{
            System.out.println("insufficient funds");
        }
    }
    abstract void interestRate();
}


class Savings extends Account{ 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    Savings(int accountNo,String holdername,int balance ){
        super( accountNo, holdername, balance);
    }
   

    
    void interestRate(){
       
        System.out.println("interset rate are 5% so gained "+0.05*balance);
    }
}






public class Abstraction0002  {
    public static void main(String[] args) {
        Savings s=new Savings(1000, "rahul", 1000);
      s.interestRate();
    }
    
}
