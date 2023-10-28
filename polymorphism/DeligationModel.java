
class Os{
    Os(){
        System.out.println("Os is installed and running");

    }
    void checkOS(){
        System.out.println("Os is still running");
    }

}
class charger{
    String name;
    charger(String name){
        this.name=name;
        System.out.println("charger created");
    }
    void checkcharger(){
        System.out.println("charger is still present");
    }

}
class Mobile{
   Os o=new Os();
 
    Mobile(){
        System.out.println("mobile is created with built OS");
    } 
    void hasA(charger c){
        System.out.println("mobile can be charged ");

        System.out.println(c.name);

    }


}

public class DeligationModel {
    public static void main(String[] args) {
        Mobile m;
        m=new Mobile();
        charger c=new charger("C type");
        m.hasA(c);

        m=null;
         c.checkcharger();
        m.o.checkOS(); //exception error
       
       
        
        


        
    }
}
