import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplecatch {
   public static void main(String[] args) {
    System.out.println("connection is established");
    Scanner sc=new Scanner(System.in);
    try{
        System.out.println("enetr numerator");
        int num=sc.nextInt();
        System.out.println("enter denominator");
        int den=sc.nextInt();
        int c=num/den;
        System.out.println(c);
        System.out.println("enetr the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enetr index");
        int index=sc.nextInt();
        System.out.println("enter element");
        int ele=sc.nextInt();
        arr[index]=ele;
        arr=null;
        System.out.println(arr[index]);
    }
    catch(ArithmeticException ae){
        System.out.println("provide non-zero denominator");

    }
    catch(NegativeArraySizeException ne){
        System.out.println("provide +ve array size");
    }
    catch(InputMismatchException ie){
        System.out.println("provide only integers");

    }catch(ArrayIndexOutOfBoundsException aie){
        System.out.println("provide valid index");

    }catch(Exception e){
        System.out.println("exception occored! try again");
    }
    System.out.println("program terminated successfuly");
   }

}
