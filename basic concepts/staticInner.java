class A{
    int i;
   static class B{
    int j;

    }
}

public class staticInner {
    public static void main(String[] args) {
        A.B obj1=new A.B();
        obj1.j=5;
        
    }
    
}
