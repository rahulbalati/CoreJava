class Bank{
    private float balance;
    public void setData(int x){
        balance=x;
    }
    public float getData(){
        return balance;

    }
}

 class Encapsulation0002 {
    public static void main(String[] args) {
       Bank e=new Bank();
        e.setData(1000);
        System.out.println(e.getData());

        
    }
}
