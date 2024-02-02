
//import org.w3c.dom.Node;

//import java.util.LinkedList;

public class Main_for_linkedList1 {
    public static void main(String[] args) {

        // linked list dont have index
        // because it is not stored in contiguous memory location
        // they are dynamic in nature
        // it contains head which points to the first node
        // and tail to point last node
        // last node points to null but has a variable to for that value
        // imp      A node contains value and next pointer
        // node is a class

        // linked list has operations like
        // addFirst
        // addLast
        // removeFirst
        // removeLast
        // indexOf
        // contains
        // size
        // toArray
        System.out.println("Linked List");

        // imp      make sure to add the path to the settings.json in .vscode folder
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        //myLinkedList.getLength();

        myLinkedList.printList();
    }

}
