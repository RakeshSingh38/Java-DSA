import java.util.*;

public class ToArrayExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array)); // Output: [Apple, Banana]
        // or
        // testing if it can be iterated like a normal array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // ToArrayWith type
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Apple");
        collection2.add("Banana");
        String[] array2 = collection2.toArray(new String[0]);
        System.out.println(Arrays.toString(array2)); // Output: [Apple, Banana]
    }
}