import java.util.*;


// i skipped comparatables 249
public class _10_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(20, 10, 30, 40, 50, 20));

        // it makes use of a tree data structure
        // it is sorted in ascending order by default
        // it does not allow duplicate elements
        // it is not synchronized
        // it has some useful methods such as
        // first() , last() , headSet() , tailSet() , subSet() , floor() , ceiling()

        //  ← FC →
        // floor
        System.out.println("floor(21) : " + ts.floor(21));
        System.out.println();

        // ceiling
        System.out.println("ceiling(29) : " + ts.ceiling(29));
        System.out.println();

        // first()
        // it returns the first element in the set
        System.out.println("first() element : " + ts.first());
        System.out.println();

        // last()
        // it returns the last element in the set
        System.out.println("last() element : " + ts.last());
        System.out.println();

        // imp       headSet() 
        //headSet(element, booleanValue)
        // it returns the elements that are less than the specified element 
        //The booleanValue parameter is optional. Its default value is false , if it is true then it includes the specified element
        System.out.println("headSet(30) element : " + ts.headSet(30, false));
        System.out.println();

        // imp      tailSet()    (inclusive)
        //tailSet(element, booleanValue)
        // it returns the elements that are greater than or equal to the specified element
        //The booleanValue parameter is optional. Its default value is true. , if false then it won't the specified element
        System.out.println("tailSet(30) element : " + ts.tailSet(30, true));
        System.out.println();

        // imp       subSet()
        // it returns the elements that are greater than or equal to the specified element
        //subSet(e1, bv1, e2, bv2)
        // The bv1 and bv2 parameter is optional. Its default value is true , if false then it won't the specified element
        // default values
        // bv1 = true
        // bv2 = false
        System.out.println("subSet(20) element : " + ts.subSet(20, false, 40, false));
        System.out.println();
    }
}
