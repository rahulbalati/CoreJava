class Stack{
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;

    }
    
  

    void push(int x){
        if(isFull()){
            System.out.println("overflow");
            System.exit(-1);
        }
        System.out.println("Inserting "+x);
        arr[++top]=x;

    }
    int pop(){
        if(isEmpty()){
            System.out.println("empty");
            System.exit(-1);
        }
        System.out.println(" deleting " + peek());
       return  arr[top--];

    }
    int peek(){

        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
    boolean isFull(){
        return top==capacity-1;
    } 
    boolean isEmpty(){
        return top==-1;
    }
    int size(){
        return top+1;
    }
   public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: ");
        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

public class stackImpArr {

   public static void main(String[] args) {
    Stack s=new Stack(3);
    s.push(1);
    s.push(2);
   
   // s.pop();
    System.out.println(s);
    System.out.println(s.peek());
    
   } 
}
