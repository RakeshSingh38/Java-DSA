
// 2:09
// tip      make sure to import ArrayList
import java.util.ArrayList;

public class _9_ArrayList_part4 {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("Chicken");
        food.add("Biryani");
        food.add("Chicken Sharwarma");

        // imp      This loop is useful when you only need to access the elements of the ArrayList and don't require the index.
        for (String i : food) {
            System.out.println((i));
        }
        System.out.println();
        // imp    useful when i need both the element and the corresponding indices
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
