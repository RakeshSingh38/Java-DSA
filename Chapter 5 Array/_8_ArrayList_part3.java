import java.util.ArrayList;
import java.util.Scanner;

public class _8_ArrayList_part3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            // imp     default value is null for arrayList

            // inititalisation
            // this tells us about the list it generate and pass it to next step
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }

            // adding elements

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(sc.nextInt());

                }
            }
            System.out.println(list);
        }

    }

}
