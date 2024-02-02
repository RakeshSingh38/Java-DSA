import java.util.ListIterator;
import java.util.Stack;

public class _2_Stack {
    public static void main(String[] args) {
        // LIFO
        // it has features such as push, pop, peek, search
        /* 
        
        Method	            Modifier and Type	    Method Description
        empty()	              boolean	            The method checks the stack is empty or not.
        push(E item)	         E	                The method pushes (insert) an element onto the top of the stack.
        pop()	                 E	                The method removes an element from the top of the stack and returns the same element as the value of that function.
        peek()	                 E	                The method looks at the top element of the stack without removing it.
        search(Object o)	     int	            The method searches the specified object and returns the position of the object.
        
         */
        // size() returns the size of the stack
        // capacity() returns the capacity of the stack
        // trimToSize() reduces the size of the stack to the number of elements in the stack    

        Stack<String> animals = new Stack<>();

        // in  stack we see the elements from the top

        animals.push("Cow");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        //          pop removes the last element from here it is horse as its LIFO

        System.out.println("Stack: " + animals);

        // peek() returns ( Displays ) the top element of the stack
        System.out.println("\npeek() function: " + animals.peek());
        System.out.println("Stack: " + animals);

        // pop() returns ( Removes ) the top element of the stack
        System.out.println("\npop() function: " + animals.pop());
        System.out.println("Horse is removed from the Stack\n");
        System.out.println("Stack: " + animals);

        // search() searches for the element in the stack and returns its position
        // returns -1 if the element is not found
        System.out.println("\nsearch() function: " + animals.search("Cow"));

        // empty() checks if the stack is empty
        System.out.println("\nIs the stack empty? " + animals.empty());

        // size() returns the size of the stack
        // currently the size of the stack is 3 as we have removed one element ( horse )
        System.out.println("\nSize of the stack: " + animals.size());

        // capacity() returns the capacity of the stack
        System.out.println("\nCapacity of the stack: " + animals.capacity());

        // trimToSize() reduces the size of the stack to the number of elements in the stack
        animals.trimToSize();
        System.out.println("\nStack after trimToSize() operation: " + animals);

        // size of the stack after trimToSize() operation
        System.out.println("\nCapacity of the stack: " + animals.capacity());

        // to iterate over the stack
        System.out.println("\n Enhanced for loop for the stack is \n");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\n Iterator for the stack is \n");
        // to iterate over the stack
        for (int i = 0; i < animals.size(); i++) {
            //System.out.println(animals.get(i));
        }

        ListIterator<String> listIterator = animals.listIterator(animals.size());
        // it traverses the list in the reverse direction and prints the elements from the previous index
        // proper way to print the stack in order of LIFO
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // imp      next is linkedList then queue , priority queue, arrayDeque
        // i am at 30:00 in the video
    }
}
