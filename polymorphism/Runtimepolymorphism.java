
class Plane{
    void fly(){
      
        System.out.println("plane is flying");
    }void land(){
        System.out.println("landing");
    }

}class Cargo extends Plane{
    void fly(){
        System.out.println("cargo plane is flying");
    }

   
} class Passenger extends Plane{
    void fly(){
        System.out.println("Passengger plane is flying");
    }
}
class Airport{
    void AllowPlane(Plane ref){
        ref.fly();
        ref.land();                   //if child doesn't have mehod it inherits parent method 

    }
}
public class Runtimepolymorphism {
    public static void main(String[] args) {
        Cargo c=new Cargo();
        Passenger p=new Passenger();
        Airport a=new Airport();
        a.AllowPlane(p);
        a.AllowPlane(c);
       // a.AllowPlane(p);

        
    }
}
