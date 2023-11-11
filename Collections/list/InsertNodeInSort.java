class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class InsertNodeInSort {
    static Node head;
   static void   insert(int data){
    Node newNode=new Node(data);
     if(head==null ||data<head.data){
       
        newNode.next=head;
         head=newNode;
        return;
       
     }
     Node curr=head;
     while(curr.next!=null && curr.next.data<data){
        curr=curr.next;

     }
     newNode.next=curr.next;
     curr.next=newNode;
    
    

    }
   static void print(){
    if(head==null){
        System.out.println("is empty");
        return;

    }
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+"->");
        curr=curr.next;
    }
    System.out.println("null");
    

    }
    public static void main(String[] args) {
       head=new Node(100);
    Node temp1=new Node(200);
    Node temp2=new Node(300);
    Node temp3=new Node(400);
    head.next=temp1;
    temp1.next=temp2;
    temp2.next=temp3;
    insert(15);
    print();
   
    
   
    }
    
}
