import java.util.*;

public class RetainAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Orange");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Apple");
        collection2.add("Banana");

        collection1.retainAll(collection2);
        System.out.println(collection1); // Output: [Apple, Banana]
    }
}