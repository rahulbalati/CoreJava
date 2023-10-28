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

public class Inheritence0003 {
    public static void main(String[] args) {
        Cargo c=new Cargo();
        c.takeoff();
        c.fly();   //overriden methods 
        c.land();
        c.carrycargo();//specialized methods

        passenger p=new passenger();
        p.takeoff();;
        p.fly();p.land();

        fighter f=new fighter();
        f.takeoff();
        f.fly();
        f.land();
        
    }
}
