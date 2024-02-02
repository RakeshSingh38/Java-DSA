import java.util.*;

public class _9_HashSet {
    public static void main(String[] args) {
        // Here E means element 
        // HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);

        HashSet<Integer> hs = new HashSet<Integer>(20, 0.25f);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(80);
        // they may not be in the same order

        System.out.println("\nHashSet: " + hs + "\n");
        System.out.println("\nAfter removing 80 from the HashSet: " + hs.remove(80) + " ");
        System.out.println("\nHashSet: " + hs + "\n");

        // The underlying data structure for HashSet is Hashtable.
        // As we know Hashtable contains only unique elements.
        // if we want add and remove operations to be performed in constant time then we use hash set
        //otherwise we use linked hash set or other Data structures

        // tip    it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.

        // duplicate elements are not allowed
        System.out.println("\nUsing for each loop: ");
        hs.forEach(n -> show(n));

        System.out.println("\n");
        // another way
        for (Integer i : hs) {
            System.out.print(i + " ");
        }
    }

    static void show(int n) {
        System.out.print(n + " ");
    }
}
