import java.util.*;

public class ClearExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.clear();
        System.out.println(collection); // Output: []
    }
}