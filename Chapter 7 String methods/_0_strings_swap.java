
public class _0_strings_swap {
    public static void main(String[] args) {
        String name = "Rakesh";
        String secName = "K";

        //name = secName;
        // tip      doing this changes both String  to "K"

        String temp;
        // so better use a temporary value ✅ 

        temp = name;
        name = secName;
        secName = temp;
        System.out.println(name);
        System.out.println(secName);

        // imp      C programming style printf works in java
        System.out.printf("MY name is %s", secName);

    }
}
