class Customer{
    private int Cid;
    private String  Cname;
    private int Cno;
    Customer(int Cid,String Cname,int Cno){
        this.Cid=Cid;
        this.Cname=Cname;
        this.Cno=Cno;
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

public class Encapsulation0003 {
    public static void main(String[] args) {
        Customer c=new Customer(1, "rahul", 41);
       System.out.println(c.getCname());
       System.out.println(c.getCno());
       System.out.println(c.getId());

        
    }
}
