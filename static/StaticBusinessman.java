import java.util.Scanner;

class StaticBusinessman{
   
   private float si;
 private   float p;
   private float t;
  private static float r;
  static {
    r=2;       //declared universally can be accessed by all 
  }
  void input(){
    Scanner sc=new Scanner(System.in);
    System.err.println("enter principal amount");
    p=sc.nextInt();
    System.out.println("enter time");
    t=sc.nextInt();
    
  }
 void calculateSI(){
    si=p*t*r/100;
    

  }
  void disp(){
    calculateSI();
    System.out.println(si);

  }

    public static void main(String[] args) {
        StaticBusinessman sb=new StaticBusinessman();
        sb.input();
        sb.disp();
        
        
    }
}
