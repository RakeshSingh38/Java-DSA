import java.util.ArrayList;

public class _6_arrray_List {
    /* imp    The ArrayList class is a resizable array, which can be found in the java.util package.
    
            The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you 
    want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from
    an ArrayList whenever you want. */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(50);
        list.add(55);
        list.add(47);
        list.add(78);
        list.add(65);
        list.add(99);

        // see     returns true it if contains the specified value 
        System.out.println(list.contains(47));

        // ->     now 0th index i.e 50 is changed to 51
        list.set(0, 51);

        // ->     now 3rd index i.e 78 is removed
        list.remove(3);
        System.out.println(list);

    }
}
