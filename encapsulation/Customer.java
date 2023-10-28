

 class Customer1 {
    private int customerId;
    private String customerName;
    private long customerPhone;

    public void setData(int x,String y,long z){
        customerId=x;
        customerName=y;
        customerPhone=z;

    }
    public int getId(){
        return customerId;
    }
    public String getName(){
        return customerName;
    }
    public long getPhone(){
        return customerPhone;
    }
}
public class Customer{
    public static void main(String[] args) {
        Customer1 c=new Customer1();
        c.setData(1, "rahul", 9353771);
    
    System.out.println(c.getName());
    System.out.println(c.getPhone());
        
    }
}
