class LinkedListImplementation {
    Node head;
    private int size;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            size++;
           
        }
    }
    //addFirst
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //addLast
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last

    public void deleteLast(){
       if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
       if(head.next==null){
        head=null;
        return;
       }
       Node secondLast=head;
       Node lastNode=head.next;
       while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
       }
       secondLast.next=null;
    }

    //print list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
         Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;

        }
        System.out.println("Null");
        
    }
    public int getSize(){
        return size;
    }

public static void main(String[] args) {
    LinkedListImplementation ll=new LinkedListImplementation();
    ll.addFirst("is");
    ll.addLast("a");
    ll.deleteLast();
    ll.printList();
   
    ll.addFirst("rahul");
    ll.addFirst("balati");
    System.out.println(ll.getSize());


    
}
}
        