import java.util.*;

public class RemoveExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.remove("Apple");
        System.out.println(collection); // Output: [Banana]
    }
}