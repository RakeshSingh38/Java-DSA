
//import java.util.List;
import java.util.LinkedList;

public class _4_LinkedList {
    public static void main(String[] args) {

        // r        LinkedList is a part of the Collection framework present in java.util package.
        // r        It provides us with dynamic arrays in Java.
        // r        Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
        //          Java uses doubly linked list to implement the linked list.
        /* 
        addFirst()	        adds the specified element at the beginning of the linked list
        addLast()	        adds the specified element at the end of the linked list
        getFirst()	        returns the first element
        getLast()	        returns the last element
        removeFirst()	    removes the first element
        removeLast()	    removes the last element
        peek()	            returns the first element (head) of the linked list
        poll()	            returns and removes the first element from the linked list
        offer()	            adds the specified element at the end of the linked list
        */

        // imp          we dont mention the size of the linked list
        //                                          ↑
        LinkedList<Integer> list = new LinkedList<>();
        // becoz nodes are only created when inserted

        // r        addFirst() adds the element at the beginning of the list
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        System.out.println("\nLinkedList: " + list + "\n");

        // r        addLast() adds the element at the end of the list
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        System.out.println("LinkedList: " + list + "\n");

        // r        getFirst() returns the first element of the list
        System.out.println("First Element: " + list.getFirst() + "\n");

        // r        getLast() returns the last element of the list
        System.out.println("Last Element: " + list.getLast() + "\n");

        // r        removeFirst() removes the first element of the list
        list.removeFirst();
        System.out.println("LinkedList removeFirst : " + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        removeLast() removes the last element of the list
        //list.removeLast();
        System.out.println("LinkedList removeLast : " + "\n" + list.removeLast());

        System.out.println("LinkedList: " + list + "\n");

        // r        peek() returns the first element of the list
        System.out.println("First Element: " + list.peek() + "\n");

        // r        poll() returns and removes the first element of the list
        System.out.println("First Element: " + list.poll() + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        offer() adds the element at the end of the list
        //list.offer(90);
        System.out.println("LinkedList offer : " + "\n" + list.offer(90) + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        offerFirst() adds the element at the beginning of the list
        //list.offerFirst(100);
        System.out.println("LinkedList offerFirst : " + "\n" + list.offerFirst(100) + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        offerLast() adds the element at the end of the list
        //list.offerLast(110);
        System.out.println("LinkedList offerLast : " + "\n" + list.offerLast(110) + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        size() returns the size of the list
        System.out.println("Size of the LinkedList: " + list.size() + "\n");

        // r        contains() checks if the list contains the specified element
        System.out.println("LinkedList contains 30: " + list.contains(30) + "\n");

        // r        indexOf() returns the index of the first occurrence of the specified element
        System.out.println("Index of 30: " + list.indexOf(30) + "\n");

        // r        lastIndexOf() returns the index of the last occurrence of the specified element
        System.out.println("Last Index of 30: " + list.lastIndexOf(30) + "\n");

        // r        set() changes the element at the specified index   
        //System.out.println("LinkedList set : " + "\n");
        //list.set(0, 120);   
        System.out.println("LinkedList set : " + "\n" + list.set(0, 120) + "\n");

        System.out.println("LinkedList: " + list + "\n");

        // r        get() returns the element at the specified index
        System.out.println("Element at index 0: " + list.get(0) + "\n");

        // some more methods

        System.out.println("For Each loop\n");
        list.forEach(System.out::println);
        //System.out.println(list.);
        System.out.println("\nFor Each loop using Show Function\n");
        list.forEach((n) -> show(n));

        System.out.println();
        System.out.println("Using iterator\n");
        for (var x = list.iterator(); x.hasNext();) {
            System.out.print(x.next() + " ");
        }
    }

    static void show(int n) {
        System.out.println(n);
    }
}
