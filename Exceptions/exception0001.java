import java.util.Scanner;

public class exception0001 {
  static  void divide(int num,int den){
    try{
        int div=num/den;  System.out.println(div);
    }catch(Exception e){
        System.out.println("arithemetic exception ca't divide by 0");
    }
       
       
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr numerator");
    int num=sc.nextInt();
    System.out.println("enter denominator");
    int den=sc.nextInt();
    divide(num, den);

    
 }

}
