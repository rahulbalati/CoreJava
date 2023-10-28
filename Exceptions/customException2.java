

import java.util.Scanner;

class insufficient extends Exception{
public String getMessage(){
  return "Insufficient Balance";
}
}
class Bank{
    int amount;
    int withdraw;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        amount=sc.nextInt();
        System.out.println("enter the amount to withdraw");
        withdraw=sc.nextInt();
    }
    void dispatch(){
        try{
            if(amount<withdraw){
                throw new insufficient();
            }else{
                System.out.println("withdrawing under process");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
public class customException2 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.input();
        b.dispatch();
    }
}
