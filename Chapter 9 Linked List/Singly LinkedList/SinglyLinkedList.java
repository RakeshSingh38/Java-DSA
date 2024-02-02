
// imp       i removed the private keyword from the class to understand it better 
//           but make sure it will be private next time

public class SinglyLinkedList {

    // it is a good practice to make the head node private
    // Here head indicates the first node in the linked list.
    // see     head nodes holds the enitre linked list 
    private Node head;

    private static class Node {

        /* r        
            data stores the value of the node.
            next is a reference to the next node in the list.
         */
        private int data;
        // fix      these both should not be static as they are part of the class so they should be non static
        //  If next is static, all nodes will point to the same next node 

        // it points to the next node in the list , crucial for linking the nodes
        Node next;

        //The constructor initializes a node with a given data value and sets the next reference to null.
        // see      now we will create a constructor 
        //   it takes data as input and sets the next to null by default
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            // assigning current next value to the current node
            // if i dont use it infinite loop as it doesn't know where to stop
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Singly Linked List");

        //An instance of SinglyLinkedList is created

        SinglyLinkedList sll = new SinglyLinkedList();

        //Nodes (head, second, third, and fourth) are created and assigned values.
        sll.head = new Node(10);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);

        // r        connecting the arrows and forming the chain starts from here

        // Now we will connect them together to form a chain

        //  Head is the starting point from which you can access all other nodes in the list by following the next pointers.
        //  here  head refers to the first node in the singly linked list sll.  
        //          ↓
        sll.head.next = second; // 10 --> 4
        //         we will assign the second to the heads next i.e head.next and so on

        // ->      for better understanding u can remove the sll and make line 10 as static 

        second.next = third; // 10 --> 4 --> 5
        third.next = fourth; // 10 --> 4 --> 5 --> 6 --> null

        sll.printList();
    }

}
