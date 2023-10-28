class Account{
    int balance=1000;;
    int accountNo=1234;
    
}
class hacker extends Account{
    void disp(){
        System.out.println("balance : "+balance);
        System.out.println("account no : "+accountNo);
        
    }
    void change(){
        balance=0;
        accountNo=4321;
    }
}
public class Inheritance0002 {
    public static void main(String[] args) {
        hacker h=new hacker();
        h.disp();
        h.change();
        h.disp();
        
    }
}
