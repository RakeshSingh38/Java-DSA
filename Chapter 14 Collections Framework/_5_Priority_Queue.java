
//import java.util.Comparator;
import java.util.Comparator;
import java.util.PriorityQueue;
//import java.util.Queue;

public class _5_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // imp     uncomment the below line to reverse the order of the queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //  In this the elements order is reversed now the priority is given to the largest element
        //  the largest element is at the head of the queue ( start )
        //  the smallest element is at the tail of the queue ( end )
        //  and hence the largest element is removed first
        // we cant say which element to delete first based on the priority ( largest or smallest ) 

        // tip      use priority heap or binary tree to visualize the priority queue

        // eg : a hospital emergency room where the patient with the most serious condition is treated first
        // it has features such as add, remove, peek, poll
        // eg :- a ticket line where the person with the highest priority gets the ticket first        

        // r        offer() inserts the element into the queue
        // minimum heap is implemented by default
        // the smallest element is at the head of the queue
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);

        System.out.println("\nQueue: " + pq + "\n");

        // r        poll() removes the head of the queue and returns ( prints ) it
        // element with the highest priority is removed i.e ( the smallest element )
        System.out.println(pq.poll() + " is removed (poll) from the Queue\n");

        System.out.println("Queue: " + pq + "\n");

        // r        peek() returns ( prints ) the head of the queue i.e the first element
        System.out.println("Head (peek) of the Queue: " + pq.peek() + "\n");

        // r        remove() removes the head of the queue and returns ( prints ) it
        System.out.println(pq.remove() + " is removed (remove) from the Queue\n");

        System.out.println("Queue: " + pq + "\n");

        // r        add() inserts the element into the queue    
        pq.add(50);
        pq.add(60);
        pq.add(70);

        System.out.println("Queue: " + pq + "\n");

        // r        size() returns the size of the queue
        System.out.println("Size ( size ) of the Queue: " + pq.size() + "\n");

        // r        isEmpty() checks if the queue is empty or not   
        System.out.println("Is the Queue empty (isEmpty) ? " + pq.isEmpty() + "\n");

        // r        contains() checks if the queue contains the specified element or not
        System.out.println("Does the Queue (contains) 30? " + pq.contains(30) + "\n");

        // r        iterator() returns an iterator over the elements in the queue
        for (Integer element : pq) {
            System.out.println("Element: " + element);
        }

        // r        clear() removes all the elements from the queue
        pq.clear();
        System.out.println("\nQueue: " + pq + "\n");

        // imp     now larger will have higher priority
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new Mycompare());
        pq2.offer(20);
        pq2.offer(10);
        pq2.offer(40);
        pq2.offer(30);

        System.out.println(pq2);
        System.out.println("\nUsing forEach() method of println:");
        pq2.forEach(System.out::println);

        System.out.println("\nUsing iterator() method:");
        pq2.forEach(show2 -> System.out.print(show2 + " "));
        System.out.println();

        pq2.poll();
        System.out.println("\nNow 40 is removed as it is the largest element in the queue");
        System.out.println("\nUsing forEach() like arrow functions:");
        pq2.forEach(n -> show(n));
    }

    static void show2(PriorityQueue<Integer> pq) {
        System.out.print("\nQueue: " + pq + "\n");
    }

    static void show(int n) {
        System.out.print(n + " ");
    }
}

// imp     now larger will have higher priority 
class Mycompare implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (a < b)
            return 1;
        if (a > b)
            return -1;

        return 0;
    }
}
