//package Chapter 5 Array.Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //for (int i : list) {
        //    System.out.print(i + " ");
        //}
        System.out.println("\nBefore set---------------------------------------\n");
        printList(list);
        list.set(5, 99);
        System.out.println("After set---------------------------------------\n");
        printList(list);

        System.out.println(list.contains(5));
        System.out.println(list.remove(4)); // removing the 4th index i.e 5
        printList(list);

        // imp      to use Collections import java.util.Collections

        // imp      to reverse sort the list
        Collections.reverse(list);

        // imp      to sort the list
        Collections.sort(list);

        // imp      to randomly shuffle the list
        Collections.shuffle(list);

        System.out.println("Taking Inputs---------------------------------------\n");
        takeInput(list);
        printList(list);
    }

    static void takeInput(ArrayList<Integer> list) {
        try (Scanner sc = new Scanner(System.in)) {
            //int in = sc.nextInt();
            //int in;
            for (int i = 0; i < 4; i++) {
                list.add(sc.nextInt());
                //   list.set(i, sc.nextInt());

            }
            System.out.println("");
        }
    }

    static void printList(ArrayList<Integer> list) {
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
}
