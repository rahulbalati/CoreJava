class StaticExp{
    static{
        System.out.println("static block printed");        //prints without creating an object always static block executes first 
    }
   static void someMethod(){
    System.out.println("method called");

    }
    StaticExp(){
        System.out.println("constructor is called");
    }
    public static void main(String[] args) {
        StaticExp s=new StaticExp();                  // next constructor executes
      someMethod();                                   //we can directly call the static method without creating an object
        
    }
}

