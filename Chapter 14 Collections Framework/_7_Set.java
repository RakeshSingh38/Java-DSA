import java.util.*;

public class _7_Set {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements
        // Set is an interface
        // Set is implemented by HashSet, LinkedHashSet, TreeSet
        // Set is not synchronized
        // Set is not thread safe   
        // Set can have only one null element   
        // Set does not have get() method   

        //   HashSet is a class that implements Set interface    
        //   HashSet is implemented using a hash table
        //   HashSet does not maintain the insertion order, sort the elements in any order ,allow duplicate elements

        // set
        Set<Integer> set = new HashSet<>();
        // By default,                   ↑
        //the capacity of the hash set will be 16
        //the load factor will be 0.75         --> 75% of the hash set is filled     

        // in set the order of the elements is not maintained
        // it can interchanges the order of the elements
        // it uses hash table internally
        set.add(12); // khkjkjhk
        set.add(13); // guhjhjkgfu
        set.add(14);
        set.add(15);

        System.out.println("\nSet: " + set + "\n");

        // r        add() inserts the element into the set

        System.out.println("Set: " + set + "\n");

        // r        remove() removes the element from the set
        //set.remove(14);
        System.out.println("Set 14 is ( remove )d : \n" + set.remove(14) + "\n");
        System.out.println("Set 14 is ( remove )d : \n" + set + "\n");

        System.out.println("Set: " + set + "\n");

        // r        contains() checks if the set contains the specified element or not
        System.out.println("Does the Set (contains) 30? \n" + set.contains(30) + "\n");

        // r        size() returns the size of the set
        System.out.println("Size ( size ) of the Set: \n" + set.size() + "\n");

        // r        isEmpty() checks if the set is empty or not
        System.out.println("Is the Set empty (isEmpty) ? \n" + set.isEmpty() + "\n");

        // r        clear() removes all the elements from the set
        set.clear();

        System.out.println("Set: " + set + "\n");

        // r        isEmpty() checks if the set is empty or not
        System.out.println("Is the Set empty (isEmpty) ? \n" + set.isEmpty() + "\n");

        // r        add() inserts the element into the set
        set.add(10);

        System.out.println("Set: " + set + "\n");

        // addAll() adds all the elements of the specified collection to the set

        // imp       Union of Sets i.e ( set1 and set2 ) is combined
        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set.addAll(set1);

        System.out.println("Union of Set (addAll) : \n" + set + "\n");

        // removeAll() removes all the elements of the specified collection from the set
        //set.removeAll(set1);
        //System.out.println("Set is ( removeALL ): " + set + "\n");

        // retainAll() removes all the elements of the set except the specified collection
        // imp      retainAll common elements are retained others are removed
        set.retainAll(set1);
        System.out.println("InterSection of set ( retainAll ): " + set + "\n");

        // containsAll() checks if the set contains all the elements of the specified collection
        System.out.println("Does the Set (containsAll) 30? " + set.containsAll(set1) + "\n");

        // toArray() returns an array containing all the elements of the set
        //Object[] array = set.toArray();
        //System.out.println("Array: " + array + "\n");

        // imp       iterator() returns an iterator over the elements in the set
        for (Integer element : set) {
            System.out.println("Element: " + element);
        }

        // some DLCA Q 
        // union is done by addAll()
        // intersection is done by retainAll()
        // difference is done by removeAll()
        // symmetric difference is done by addAll() and removeAll()
        // subset is done by containsAll()
        // superset is done by containsAll()
        // disjoint is done by containsAll()
        // equal is done by containsAll() and size()
        // empty is done by isEmpty()
        // universal is done by containsAll()
        // complement is done by removeAll()
        // power set is done by containsAll()
        // cardinality is done by size()
        System.out.println(
                "------------------------------------------------------------------------------------------------");

        Set<Integer> firstSet = new HashSet<Integer>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        firstSet.add(5);

        Set<Integer> secondSet = new HashSet<Integer>();
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);

        // imp     union of two sets ( combined )
        /*firstSet.addAll(secondSet);
        System.out.println("\nUnion of Set (addAll) : ");
        System.out.println(firstSet);*/
        // [1, 2, 3, 4, 5]

        // difference of two sets   
        // imp      intersection of two sets (common elements)
        /*     firstSet.retainAll(secondSet);
        System.out.println("\nIntersection of Set (retainAll) :");
        System.out.println(firstSet);
        System.out.println();*/
        // [3, 4, 5]

        // imp    difference of two sets ( uncommon elements )
        /* firstSet.removeAll(secondSet);
        System.out.println("\nDifference of Set (removeAll) : ");
        System.out.println(firstSet);*/
        //System.out.println(firstSet);
        // [1, 2]

        // subset of two sets ( firstSet is a subset of secondSet )
        System.out.println("\nSubset of Set (containsAll) : ");
        // if all the elements of secondSet are present in firstSet then it is a subset
        System.out.println(firstSet.containsAll(secondSet));
        System.out.println(firstSet);
        // [1, 2, 3, 4]
    }
}
