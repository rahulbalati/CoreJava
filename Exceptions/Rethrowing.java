

class Demo1 {
    void fun1() {
        System.out.println("entering fun1");
        try {
            fun2();
        } catch (Exception e) {
            System.out.println("Exception at fun1()");
            throw e;
        }
    }

    void fun2() {
         System.out.println("entering fun2");
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("exception at fun2");
            throw e;
        }
    }
}

public class Rethrowing {
    public static void main(String[] args) {
        System.out.println("entering main");
        Demo1 d = new Demo1();
        try {
            d.fun1();
        } catch (Exception e) {
            System.out.println("exception at main()");
        }
        System.out.println("existing main ");
    }
}
