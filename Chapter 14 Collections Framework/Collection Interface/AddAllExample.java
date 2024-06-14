import java.util.*;

public class AddAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Orange");
        collection2.add("Grapes");

        collection1.addAll(collection2);
        System.out.println(collection1); // Output: [Apple, Banana, Orange, Grapes]
    }
}