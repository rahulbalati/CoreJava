class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}
public class SearchInLinkedList {
  static int  iterate(int key,Node head){
    int currpos=1;
    Node curr=head;
    while(curr!=null){
        if(key==curr.data){
            return currpos;

        }else{
            curr=curr.next;

        }
        currpos++;
    }
    return -1;

    }
    public static void main(String[] args) {
        Node head=new Node(100);
        Node temp1=new Node(200);
        Node temp2=new Node(300);
        Node temp3=new Node(400);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=null;
        System.out.println(iterate(40, head));

        
    }
}
