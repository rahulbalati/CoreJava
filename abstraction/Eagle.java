abstract class bird{
   abstract void fly();
}

class Eagle extends bird {
  void   fly(){
    System.out.println("eagle is flying");

    }
    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
    }
    
}
