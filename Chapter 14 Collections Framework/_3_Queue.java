import java.util.LinkedList;
import java.util.Queue;

public class _3_Queue {
    public static void main(String[] args) {
        // FIFO
        // eg: a ticket counter where once we get the ticket we get out of the queue
        // it has features such as add, remove, peek, poll
        /* 
        
        Method	            |   Modifier and Type	 |   Method Description
        add(E e)	        |       boolean	         |   The method inserts the specified element into the queue.
        remove()	        |       boolean	         |   The method removes the head of the queue and returns the same element as the value of that function.
        peek()	            |         E	             |   The method looks at the head of the queue without removing it.
        poll()	            |         E	             |   The method removes the head of the queue and returns it. It returns null if the queue is empty.
        element()	        |         E	             |   The method looks at the head of the queue without removing it. It throws NoSuchElementException when the queue is empty.
        offer(E e)	        |         boolean	     |   The method inserts the specified element into the queue.
        size()	            |         int	         |   The method returns the number of elements in the queue.
        isEmpty()	        |         boolean	     |   The method checks if the queue is empty or not.
        contains(Object o)  |	      boolean	     |   The method checks if the queue contains the specified element.
        iterator()	        |        Iterator<E>	 |   The method returns an iterator over the elements in the queue.
        */

        /* 
        Some of the commonly used methods of the Queue interface are:
        
        add() -         Inserts the specified element into the queue. 😤😤
                        If the task is successful, add() returns true, if not it throws an exception.

        offer() -       Inserts the specified element into the queue. ✅✅
                        If the task is successful, offer() returns true, if not it returns false.

        element() -     Returns the head of the queue.  😤😤
                        Throws an exception if the queue is empty.

        peek() -        Returns the head of the queue. ✅✅
                        Returns null if the queue is empty.

        remove() -      Returns and removes the head of the queue.  😤😤
                        Throws an exception if the queue is empty.

        poll() -        Returns and removes the head of the queue. ✅✅
                        Returns null if the queue is empty.
         */
        Queue<Integer> queue = new LinkedList<>();

        // r        offer() inserts the element into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("\nQueue: " + queue + "\n");

        // r        poll() removes the head of the queue and returns ( prints ) it
        System.out.println(queue.poll() + " is removed from the Queue\n");

        System.out.println("Queue: " + queue + "\n");

        // r        peek() returns ( prints ) the head of the queue i.e the first element
        System.out.println(queue.peek() + " is the head of the Queue\n");
        // i removed 10 so head is 20   

        System.out.println("Queue: " + queue + "\n");

        // r        size() returns the size of the queue
        System.out.println("Size of the Queue: " + queue.size() + "\n");

        


    }
}
