import java.util.ArrayDeque;

public class _6_Array_Deque {
    public static void main(String[] args) {
        // Array deque is a double ended queue
        // imp          we dont mention the size of the ArrayDeque

        // tip    use ArrayDeque instead of LinkedList to implement it as 
        //        deque uses a dynamic array to store the elements

        // It is a resizable array , It is faster than linked list and stack , It is not thread safe , It is not synchronized , It can have null elements

        // in array deque we can ( add , remove and get ) elements at the beginning and at the end of the list

        // r        it is pronounced as Array Deck
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // r        addFirst() adds the element at the beginning of the list
        adq.addFirst(10);
        adq.addFirst(20);
        adq.addFirst(30);

        System.out.println("\nArrayDeque: " + adq + "\n");

        // r        addLast() adds the element at the end of the list
        adq.addLast(40);
        adq.addLast(50);
        adq.addLast(60);

        System.out.println("ArrayDeque: " + adq + "\n");

        // r        getFirst() returns the first element of the list
        System.out.println("First Element: " + adq.getFirst() + "\n");

        // r        getLast() returns the last element of the list
        System.out.println("Last Element: " + adq.getLast() + "\n");

        // r        removeFirst() removes the first element of the list
        adq.removeFirst();

        System.out.println("ArrayDeque removeFirst : " + "\n");

        System.out.println("ArrayDeque: " + adq + "\n");

        // r        removeLast() removes the last element of the list
        adq.removeLast();

        System.out.println("ArrayDeque removeLast : " + "\n");

        System.out.println("ArrayDeque: " + adq + "\n");

        // r        peek() returns the first element of the list

        System.out.println("First Element: " + adq.peek() + "\n");

        // array peekFirst() returns the first element of the list
        System.out.println("First Element: " + adq.peekFirst() + "\n");

        // r        peekLast() returns the last element of the list
        System.out.println("Last Element: " + adq.peekLast() + "\n");

        // r        poll() returns and removes the first element of the list
        System.out.println("First Element: " + adq.poll() + "\n");

        // r        pollFirst() returns and removes the first element of the list
        System.out.println("First Element: " + adq.pollFirst() + "\n");

        // r        pollLast() returns and removes the last element of the list
        System.out.println("Last Element: " + adq.pollLast() + "\n");

        System.out.println("ArrayDeque: " + adq + "\n");

        // r        offer() adds the element at the end of the list
        adq.offer(70);
        adq.offer(80);
        adq.offer(90);

        System.out.println("ArrayDeque: " + adq + "\n");

        // r        size() returns the size of the list
        System.out.println("Size ( size ) of the ArrayDeque: " + adq.size() + "\n");

        // r        isEmpty() checks if the list is empty or not
        System.out.println("Is the ArrayDeque empty (isEmpty) ? " + adq.isEmpty() + "\n");

        // r        contains() checks if the list contains the specified element or not
        System.out.println("Does the ArrayDeque (contains) 30? " + adq.contains(30) + "\n");

        // r        iterator() returns an iterator over the elements in the list
        for (Integer element : adq) {
            System.out.println("Element: " + element);
        }

        // r        clear() removes all the elements from the list
        adq.clear();

        System.out.println("\nArrayDeque is (clear) : " + adq + "\n");

        System.out.println("Using ArrayDeque as a Stack: \n");
        // using array deque as a stack
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(12);
        dq.offerLast(24);
        dq.offerLast(36);
        dq.offerLast(48);

        // offer last is inserted at last 12 -> 24 -> 36 -> 48
        //dq.forEach((n) -> show(n));
        // or

        // imp     in stack we insert elements at the top of the stack
        //        so we use offerFirst() to insert elements at the top of the stack
        //      we dont use offerLast(); 
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        // inserted at first 4 -> 3 -> 2 -> 1

        // when o/p is combined we get 4 -> 3 -> 2 -> 1 -> 12 -> 24 -> 36 -> 48
        dq.forEach(n -> show(n));

        // to delete E from last use
        // dq.pollLast();
    }

    static void show(int n) {
        System.out.print(n + " -> ");
    }
}
