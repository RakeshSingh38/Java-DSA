import java.util.LinkedList;

// tip    Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

public class LinkedList_2 {
    public static void main(String[] args) {
        // imp      The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

        //             LinkedList Methods
        //             ↓             ↓
        /* ->   addFirst()	        Adds an item to the beginning of the list.	
                addLast()	        Add an item to the end of the list	
                removeFirst()	    Remove an item from the beginning of the list.	
                removeLast()	    Remove an item from the end of the list	
                getFirst()	        Get the item at the beginning of the list	
                getLast()	        Get the item at the end of the list*/


        LinkedList<String> linkedList = new LinkedList<String>();

        // ->    treating linked list as a stack

        //linkedList.push("A");
        //linkedList.push("B");
        //linkedList.push("c");
        //linkedList.push("D");
        //linkedList.push("E");
        //linkedList.push("F");

        // imp       pop removes the top element and doesnt takes any argument
        //linkedList.pop();
        // [F, E, D, c, B, A]  
        //System.out.println(linkedList);

        // we need to traverse the linked list to get the element 
        linkedList.add(0,"A");
        linkedList.add(1,"B");
        linkedList.add(2,"C");
        linkedList.add(3,"D");
        linkedList.add(4,"E");
        
        // if no argument is passed it will remove the first element
        linkedList.remove();

        // searching for the element
        System.out.println(linkedList.indexOf("E"));

        // peeking at the head element
        System.out.println("Peek First "+linkedList.peekFirst());
        // peeking at the tail element ( last element )
        System.out.println("Peek Last "+linkedList.peekLast());

        // Adding element at the first position
        System.out.print("\n\"A\" Added to first in list ");
        linkedList.addFirst("A");
        System.out.println(linkedList);
        System.out.println();

        // Addong element at the last position
        System.out.print("\"F\" Added to last in list ");
        linkedList.addLast("F");
        System.out.println(linkedList);
        System.out.println();

        // Removing element from the first position
        System.out.print("\"A\" is Removed first from List ");
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println();












        // ->    treating linked list as a queue
        LinkedList<String> linkedListForQueue = new LinkedList<String>();

        // offer adds the element to the end of the list
        // poll removes the element from the front of the list
        linkedListForQueue.offer("A");
        linkedListForQueue.offer("B");
        linkedListForQueue.offer("C");
        linkedListForQueue.offer("D");
        linkedListForQueue.offer("E");
        // Same as pop it doesnt takes any argument
        // it removes the element from the front of the list i.e first element "A"
        linkedListForQueue.poll();

        //System.out.println(linkedListForQueue);

    }
}
