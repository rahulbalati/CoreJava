
    
public class queueImplementation {
  static  class Node{
        int data;
        Node  next;
        Node(int data){
            this.data=data;
        }
    }
  static class Queue{
    static Node head=null;
    static Node tail=null;

    public static boolean isEmpty(){
        return head==null && tail==null;
    }

    //enque
    public  void add(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            tail=head=newNode;

        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    //deque
    public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front=head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
        return front;
    }
    public int peek(){
         if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return head.data;

    }
    

}
    public static void main(String[] args) {
        //queue can be implemented using arrays but not preffered for removing takes O(n) time and fixed size
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
    }
}