package OOPS;
abstract class plane{
    abstract void fly();
    abstract void land();
    abstract void carry();


}
class Cargo extends plane{
    void fly(){
        System.out.println("Cargo flys at low height");
    }
    void land(){
        System.out.println("cargo is landing");
    }void carry(){
        System.out.println("cargo carry goods");
    }

}
class passenger extends plane{
     void fly(){
        System.out.println("passneger flys at mediaum height");
    }
    void land(){
        System.out.println("passengerplane is landing");
    }void carry(){
        System.out.println("passengerplane carry passengers");
    }

}class Fighter extends plane{
     void fly(){
        System.out.println("fighter flys at hihg height");
    }
    void land(){
        System.out.println("fighter is landing");
    }void carry(){
        System.out.println("fighter carry weapons");
    }

}
class Airport{
    void AllowPlane(plane ref){
        ref.fly();
        ref.carry();
        ref.land();
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cargo c=new Cargo();
        Fighter f=new Fighter();
        passenger p=new passenger();
        Airport a=new Airport();
        a.AllowPlane(f);
        a.AllowPlane(c);
        a.AllowPlane(p);

        
    }
}
