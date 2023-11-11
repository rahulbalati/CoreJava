class Node{
    Node next;
   
    int data;
    Node(int data){
        this.data=data;
    }
}

public class MiddleOfLList {
    static Node head;
   static void Middle(){
    if(head==null){
        System.out.println("empty");
        return ;
    }
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println("Middle node "+slow.data);

   }
    public static void main(String[] args) {
        int arr[]={100,200,300,400,500,600};
        head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<arr.length;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;

        }
        Middle();

        
    }
}
