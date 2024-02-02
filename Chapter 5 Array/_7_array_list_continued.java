import java.util.ArrayList;
import java.util.Scanner;

public class _7_array_list_continued {
    public static void main(String[] args) {
        // imp     1 > Size is fixed internally
        //                 2 > Arrays list fixed by some amount
        // ->               -- it will create a new arraylist of say double the size
        // ->               -- old elements are copied to new one
        // ->               -- old list is deleted

        // imp     tip : amortized time complexity is O(1) 
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>(5);
            // list.add(50);
            // list.add(55);
            // list.add(47);
            // list.add(78);
            // list.add(65);
            // list.add(99);

            // imp   iterating through a list
            for (int i = 0; i < 4; i++) {
                list.add(sc.nextInt());
            }

            for (int i = 0; i < 4; i++) {
                // ->     pass index here
                System.out.print(list.get(i)+" ");

            }
            System.out.println(list);
        }

    }
}
