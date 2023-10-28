import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})     //to apply for mutiple places
@Retention(RetentionPolicy.RUNTIME)

@interface CricketPlayer{
    int age();          //default 34 can also be set
    String country();

}
@CricketPlayer(age=24,country="india")          //extra information addded to source code
class Virat{
   private  int runs;
   private  int innings;
  void setRuns(int runs){
    this.runs=runs;
   }
   void setInnngs(int innings){
    this.innings=innings;
   }
   int getRuns(){
    return runs;
   }
   int getInnings(){
    return innings;
   }

}

public class CustomAnnotations {
    public static void main(String[] args) {
        Virat v=new Virat();
        v.setRuns(10000);
        v.setInnngs(1000);
        System.out.println(v.getInnings());
        System.out.println(v.getRuns());
    }
    
}
