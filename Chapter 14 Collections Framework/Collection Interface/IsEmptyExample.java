import java.util.*;

public class IsEmptyExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.isEmpty()); // Output: true
        collection.add("Apple");
        System.out.println(collection.isEmpty()); // Output: false
    }
}