
class Parent{
    void disp(){
        System.out.println("inside parent disp");
        
    }
}
class child1 extends Parent{
    void disp(){
        System.out.println("inside child1 class");
    }
}
class child2 extends Parent{
    void disp(){
        System.out.println("inside child2 class");
    }
    void land(){
        System.out.println("landing");
    }
}


public class ParentRefernceObject {
    public static void main(String[] args) {
        child1 c1=new child1();
        child2 c2=new child2();
        Parent p=new Parent();
        Parent ref;
        ref=p;
        ref.disp();
        ref=c1;
        ref.disp();
        ref=c2;
        ref.disp();
       ((child2)(ref)).land();              //downcasting  done for parent refence to access specalized methods

    }
    
}
