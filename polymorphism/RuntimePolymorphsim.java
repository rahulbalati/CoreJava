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
class Airport{
    void permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}
public class RuntimePolymorphsim {
    public static void main(String[] args) {
        Cargo c=new Cargo();
        fighter f=new fighter();
        passenger p=new passenger();
        Airport a=new Airport();
        a.permit(f);
        a.permit(c);
        a.permit(p);
        
    }
}
