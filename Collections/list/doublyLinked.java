class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data=data;
    }
}
public class doublyLinked {
    static Node head;
    static  void   print(Node head){
        if(head==null){
            System.out.println("is empty");
        }
    Node curr=head;
    while(curr!=null){
        System.out.println(curr.data);
       curr=curr.next;
    }

    }
    static void insertFirst(int data){
     Node newNode=new Node(data);

       
        if(head==null){
            head=newNode;
            return;

        } /* 
        newNode.next=head;
        head.prev=newNode;
        head=newNode;*/
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;



    }
    static void insertLast(int data){
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
    }
    static void reverse(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        
    }
    static void deleteFirst(){
        if(head==null){
       
        return ;
        }
       head=head.next;
        

    }
    static void deleteLast(){
        if(head==null){
            System.out.println("is empty");
            return;
        }
        if(head.next==null){
            head=head.next;
            return;
        }
        Node curr=head;
        Node forward=head.next;
        while(forward.next!=null){
            curr=curr.next;
            forward=forward.next;
        }
        curr.next=null;
        forward.prev=null;

    }


    public static void main(String[] args) {
        head=new Node(100);
    Node temp1=new Node(200);
    Node temp2=new Node(300);
    Node temp3=new Node(400);
    head.next=temp1; 
    temp1.next=temp2;
    temp1.prev=head;
    temp2.next=temp3;
    temp2.prev=temp1;
    temp3.prev=temp2;
   
    
   
   // reverse();
  // deleteFirst();
 // deleteLast();
  
   
  
    print(head);
    
    
    }
  
}
