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
        this(Cname);
        
    }
  Customer(String Cname) {
    this();
    this.Cname=Cname;

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


public class ConstuctorThis0002 {
    public static void main(String[] args) {
        Customer c=new Customer(2,"smith",5);
        Customer c1=new Customer("pavan");
        System.out.println(c.getId());
        System.out.println(c.getCno());
        System.out.println(c.getCname());
        System.out.println(c1.getCname());
       System.err.println(c1.getCno());
    }
}
