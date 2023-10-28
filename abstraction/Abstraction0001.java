abstract class shape{
  String color;
    abstract double area();
    public abstract String toString();

    shape(String color){
        System.out.println("shape constructor called");
        this.color=color;
    }
    String getColor(){
        return color;
    }
    
} 
class Circle extends shape{
    double radius;
    Circle(String color,double radius ){
        super(color);
        this.color=color;
        this.radius=radius;


        
    }
    double area(){
       return Math.PI*Math.pow(radius,2);
    }
    public String toString(){
        return "circle color is "+getColor()+" area is "+area();
    }

}
class Abstraction0001{
    public static void main(String[] args) {
       Circle c=new Circle("red", 7);
       System.out.println(c);
    }
}