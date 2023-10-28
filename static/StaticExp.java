class StaticExp{
    static{
        System.out.println("static block printed");        //prints without creating an object
    }
   static void someMethod(){
    System.out.println("method called");

    }
    StaticExp(){
        System.out.println("constructor is called");
    }
    public static void main(String[] args) {
        StaticExp s=new StaticExp();
      someMethod();
        
    }
}

