class Customer{
    private int Cid;
    private String  Cname;
    private int Cno;
    Customer(){
        Cid=1;
        Cname="rahul";
        Cno=12;
    }
    Customer(int Cid,String Cname,int Cno){       
        this();          //it is used to call zero-parameterized constructor
    }
   String getCname(){
        return Cname;
    }
    int getId(){
        return Cid;
    }
    int getCno(){
        return Cno;

    }
    
}

class ConstructorThis0001{
    public static void main(String[] args) {
        Customer c=new Customer(2,"smith",5);
      System.out.println(c.getId());
      System.out.println(c.getCno());
      System.out.println(c.getCname());

        
    }
}