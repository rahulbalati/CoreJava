class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class insertNodepos{
    static Node head; // Head of the linked list

    // Function to insert a new node at a specified position
    static void insertNode(int position, int data) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (currentPosition < position - 1 && current != null) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Invalid position. Node not inserted.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Function to display the linked list
    static void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        head.next = node2;
        node2.next = node3;

        System.out.println("Original Linked List:");
        displayList();

        insertNode(2, 15); // Insert 15 at position 2

        System.out.println("Linked List after insertion:");
        displayList();
    }
}
