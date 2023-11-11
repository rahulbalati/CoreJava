interface shape{
   
    abstract void Anyshape();                 //functional interface as it has only one abstract method
}
class ImplementsShape{
    // @Override                                             //normal implementation
    // // public void Anyshape() {
    // //     // TODO Auto-generated method stub
    // //     System.out.println("just providing some implementation");
    // // }
   

}

public class lambdaExpression {
    public static void main(String[] args) {
        // ImplementsShape im=new ImplementsShape();
        // im.Anyshape();
         shape s=()->{                                      //using lambda expression directly implement method no need to implement
        System.out.println("some implementation");
    };
    s.Anyshape();
    }
}
