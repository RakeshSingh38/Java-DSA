import java.util.*;

public class ContainsExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        System.out.println(collection.contains("Apple")); // Output: true
        System.out.println(collection.contains("Orange")); // Output: false
    }
}