/*
public class LinkedList {

    private Node head;
    private Node tail;
    //private int length;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        //length = 1;
    }

    public void addLast(int item) {
        //var newNode = new Node(item);
        //newNode.value = item;
        //if(first==null)
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head " + head.value);
    }

    public void getTail() {
        System.out.println("Tail " + tail.value);
    }

    //public void getLength() {
    //    System.out.println("Length " + length);
    //}
}*/

class Node {
    int val;
    Node next;

    Node(int v1) {
        this.val = v1;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        System.out.println(n1.next);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println();
        System.out.println();

        System.out.println(n1.val); // 10
        System.out.println(n1);
        System.out.println(n1.next.val); // 20
        System.out.println(n1.next.next.val); // 30
        System.out.println(n1.next.next.next.val); // 40
        System.out.println(n1.next.next.next.next.val); // 50

        System.out.println("\nn3");
        System.out.println(n1.next.next.val);
        System.out.println();
        System.out.println();

        System.out.println(n1.val);
        System.out.println(n1.next.val);

        System.out.println();
        System.out.println((n1.next));
        System.out.println(System.identityHashCode(n1.next));
        System.out.println("\nOld linked list");
        printLinkedList(n1); // Pass the head node as an argument

        System.out.println("\n\nInsert at start in linked list");
        insertAtStart(n1, 60);

        //printLinkedList(n1); // Pass the head node as an argument

        System.out.println("\n\nInsert at last in linked list");
        insertAtLast(n1, 60);

        System.out.println("\n\nInsert at index\n");
        insertAtIndex(n1, 3, 60);
        printLinkedList(n1);
        System.out.println("\n\nDelete at last\n");
        deleteAtLast(n1);
        printLinkedList(n1);
        System.out.println("\n\nReverse the list\n");
        reverseList(n1);

        System.out.println("\n\nDelete middle of linked list\n");
        deleteMiddleOfLinkedList(n1);
        printLinkedList(n1);
        printLinkedList(n1);
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        //System.out.println(temp.next);
        while (temp != null) {
            //while (temp.next != null) {
            // imp     wont print last element as it will immediately exit once it find temp.next ref 5 is null so 50 wont be printed 

            //System.out.print(temp.val + " -> ");
            //System.out.print("  " + temp.next + " ");
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    static void insertAtStart(Node head, int val) {
        Node n1 = new Node(val);
        n1.next = head;
        //System.out.println(n1.val);
        //System.out.println(n1.val + " head is ");
        //System.out.println(head.val);

        head = n1;
        //System.out.println(n1.val + " head is " + head.val);

        //System.out.println();
        //System.out.println(n1.val);
        //System.out.println(head.val + " head is ");
        //i have to print the head node to see the changes else it will print the same old list
        // so i have to pass the head node to the printLinkedList method to see the changes
        printLinkedList(head);
    }

    static void insertAtLast(Node head, int val) {
        // create a new node
        Node n6 = new Node(val);

        // traverse the list to find the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // make the last node's next as new node
        // tip      whenever u see .next at the left side of the assignment operator then it means it is changing the reference of the node
        // so here temp.next is changing the reference of the last node to the new node

        temp.next = n6;
        // tip      whenever u see .next at the right side of the assignment operator then it means it is getting the reference of the node 
        printLinkedList(head);
    }

    static void insertAtIndex(Node head, int k, int v) {
        // creation of node
        Node n1 = new Node(v);
        Node temp = head;
        //System.out.println(temp.val);
        for (int i = 1; i <= k - 1; i++) {
            System.out.println(temp);
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println("temp  " + temp);
        System.out.println(temp.next);
        System.out.println(temp.val); // 30
        System.out.println(temp.next.val); // 40
        // as we can see the value of temp is at ref3
        // but as soon i do temp.next it will do temp.next which will refer to ref4 as temp is ref3 
        Node temp2 = temp.next;

        // this line is important as it will change the reference of the temp node to the new node
        temp.next = n1;

        System.out.println(n1);
        System.out.println(n1.val);
        System.out.println();
        System.out.println("\ntempppp  2");
        System.out.println(temp2.val); // 40
        System.out.println("\ntempppp  3");

        // so temp2 is ref4
        n1.next = temp2;

        System.out.println(temp2.val); // 40
        System.out.println(temp.next.val); // 60
        System.out.println("n1 is   " + n1.next.val);
    }

    static void deleteAtLast(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
            System.out.println(temp.val);
        }
        // as we can see the ref4.next i.e ref5 is null
        //System.out.println("temp  "+temp.next.next.next);
        //System.out.println(temp.val);
        // this line will change the reference of the second last node to null
        temp.next = null; // 60 is deleted
        //printLinkedList(head);
    }

    static void reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            System.out.println(prev.val);
            curr = currp1;
        }
        //prev = head;
        //System.out.println(prev.val);
        System.out.println("\n" + prev.val);
        // tip     Sop (head.next.val) or (prev.next.val); both are at last node so it will give null pointer exception
        printListNode(prev);
    }

    public static void printListNode(Node head) {
        Node temp = head;
        System.out.print("null");
        while (temp != null) {
            System.out.print(" -> " + temp.val);
            temp = temp.next;
        }
    }

    public static Node deleteMiddleOfLinkedList(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;

    }
}