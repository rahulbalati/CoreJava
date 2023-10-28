class Box<T>
{
   T container;
   public void setValue(T container){
    this.container=container;
   }
   public T getValue(){
    return container;
   }


}
public class generics {
    public static void main(String[] args) {
        Box<Integer> m=new Box<Integer>();
        m.setValue(5);
        System.out.println(m.getValue());
    }
    
}
