import java.util.HashMap;

public class _3_Hashing_basics {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("China", 200);
        map.put("Nepal", 10);

        System.out.println(map);

        System.out.println(map.get(map.keySet().toArray()[0]));
        // case sensitive
        System.out.println(map.get("India"));

        // if no key is found then it returns null
        System.out.println(map.get("bhutan"));

        // coz it contains India
        System.out.println(map.containsKey("India")); // true

        System.out.println(map.containsKey("Bhutan")); // false

        // remvoe the key
        // now china is removed
        System.out.println(map.remove("China"));

        // if the key is not present then it returns null   
        System.out.println(map.remove("Bhutan")); // null
        System.out.println(map);

        // if the key is not present then it returns -1 ( default value )
        System.out.println(map.getOrDefault("Bhutan", -1)); // -1

        // size of the map
        System.out.println(map.size()); // 2

        System.out.println(map.isEmpty()); // false
    }
}