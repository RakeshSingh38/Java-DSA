import java.util.*;

public class _2_Remove_even {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        //or
        //Collection<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Printing Collections\n");
        printCollections(list);

        System.out.println("\n\nRemoving even numbers");
        removeEven(list);
        System.out.println(list);
    }

    public static void removeEven(Collection<Integer> c) {
        // imp      what i am doing is i am removing the even numbers from the collection
        // the argument of this function is a collection of integers named c

        c.removeIf(n -> n % 2 == 0);
        //or
        /* Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0)
                it.remove();
        }*/
    }

    static void printCollections(Collection<Integer> c) {
        System.out.println("Using forEach loop of Object e");
        for (Object e : c) {
            System.out.print(e + " ");
        }
        //or
        System.out.println("\n");
        System.out.println("Using forEach loop like arrow functions");
        c.forEach(list -> {
            System.out.print(list + " ");
        });
    }
}
