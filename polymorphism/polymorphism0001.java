class Plane{
    void takeoff(){
        System.out.println("plane takes off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landing");
    }
}
class Cargo extends Plane{
    void fly(){
        System.out.println("carho plane is flying");
    }
    void carrycargo(){
        System.out.println("carying cargo");
    }
}
class passenger extends Plane{
    void fly(){
        System.out.println("passenger plane is flying");
    }
    void carrypasssenger(){
        System.out.println("carrying passenger");
    }
}
class fighter extends Plane{
    void fly(){
        System.out.println("fighter is flying");
    }
    void carryMissile(){
        System.out.println("carries misiles");
    }
} 
public class polymorphism0001 {
    public static void main(String[] args) {
        Cargo c=new Cargo();
        fighter f=new fighter();
        passenger p=new passenger();
        Plane ref;
        ref=c;
        ref.takeoff();
        ref.land();
        ref.fly();
     ((Cargo)ref).carrycargo();
        ref=p;
        ref.takeoff();
        ref.land();
        ref.fly();

     ((passenger) ref).carrypasssenger();
        ref=f;
        ref.takeoff();
        ref.land();
        ref.fly();
     ((fighter) ref).carryMissile();

        
    }
}
