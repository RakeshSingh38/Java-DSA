import java.util.*;

public class ContainsAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Apple");

        System.out.println(collection1.containsAll(collection2)); // Output: true
    }
}