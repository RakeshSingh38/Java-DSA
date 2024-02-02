
public class LinkedList {

    private Node head;
    private Node tail;
    //private int length;

    private  class Node {
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
}