
import java.util.Scanner;

class underageException extends Exception{
   public String  getMessage(){
        return "below 18 ";

    }
}
class overageException extends Exception{
    public String  getMessage(){
        return "above 60 ";

    }
}
class RTO{
    int age;
    void input(){
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
    }
    void dispatch(){
        try{
        if(age<18){
            throw new underageException();
        }else if(age>60){
            throw new overageException();
        }else{
            System.out.println("collect your DL");
        }
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        RTO r=new RTO();
        r.input();
        r.dispatch();

        
    }
}
