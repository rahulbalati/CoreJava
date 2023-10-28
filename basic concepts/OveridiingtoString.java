class person{
    int age;
    person(int age){
        this.age=age;
    }
    void disp(){
        System.out.println("age is "+ age);
    }
    public String toString(){
        return "age is "+age;
    }
}
public class OveridiingtoString {
    public static void main(String[] args) {
        person p=new person(15);
        p.disp();
        System.out.println(p);
        
    }
}
