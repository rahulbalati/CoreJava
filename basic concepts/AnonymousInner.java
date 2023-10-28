class Phone{
    public void show(){
        System.out.println("call");
    }
}

public class AnonymousInner {
   public static void main(String[] args) {
    Phone p=new Phone(){
        public void show(){
            System.out.println("call msg whatsapp");
        }

    };
    p.show();
   
    
   }
}
