/*
 * Constructor is a specialized method which is having same name of that class
 * constructors donot have any return type even no void 
 * we can print statements within constructor
 * these get executed at a time of object creation
 * 
 * Constructor chaining refers to calling one constructor from another constructor
 */
class test1{
    int x,y;
    test1(){       //constructor
        x=100;
        y=200;

    }test1(int x,int y){    //parameterized constructor
        this.x=x;
        this.y=y;

    }

}class test2 extends test1{
     int a,b;
    test2(){
        this(9, 99);
        a=300;
        b=400;

    }test2(int a,int b){
      //  super(a, b);
        this.a=a;
        this.b=b;
        
    }
    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }


}

public class ConstructorChaining {
    public static void main(String[] args) {
        test2 t=new test2();
        t.disp();

        
    }
}
