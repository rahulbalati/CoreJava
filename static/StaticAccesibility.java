public class StaticAccesibility {
    static int a=10;
    static int b=20; //we can make instance variables as static and public
    int x=30;
    int y=40;

    static {
        System.out.println("static block executed");
       // x=20;      //shows error because static block  cannot acces non-static
       a=30;
       b=40;          //within block we cannot make variable as static or public


    }
    {
        System.out.println("instance block ");
        a=50;             //it can access both static as well as non-static variables
        b=60;        
        x=20;
        y=10;
    }
    public static void main(String[] args) {
        StaticAccesibility s=new StaticAccesibility();   //instance block calls when object gets created
        

        
    }
}
