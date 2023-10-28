

import java.util.Scanner;

class caughtByMom extends Exception{
  public String getMessage(){
    return "flying slipper recieved";
  }  

}
class caughtByDad extends Exception{
    public String getMessage(){
        return "chill, want any money";
    }

}
class girlfriend{
    String name;
    String input;
    girlfriend(String name){
        this.name=name;
        System.out.println("gf name is "+name);
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("caught by");
        input=sc.next();
       
    }
    void caughtBy(){ try{
        if(input.equals("mom")){
            throw new caughtByMom();

        }else if(input.equals("dad")){
            throw new caughtByDad();
        }else{
            System.out.println("please enter input as only 'dad' or 'mom'");
        }
       
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
        
    }
    
}
public class CustomException1 {
    public static void main(String[] args) {
        girlfriend g=new girlfriend("Meko Chan");
        g.input();
        g.caughtBy();
        
    }
    
}
