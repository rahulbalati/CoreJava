class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }



}
public class recursiveLinked {
  static void rprint(Node head){
        if(head==null){
            return ;
        }
        System.out.println(head.data);
       rprint(head.next);
       
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=null;
        rprint(head);
        
    }
    
}
