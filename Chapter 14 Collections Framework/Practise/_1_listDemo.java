//package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _1_listDemo {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(8);
        li.add(20);
        li.add(8);
        li.add(8);
        li.add(8);
        li.add(3, 9);
        System.out.println(li);

        System.out.println(li.contains(9));

        ArrayList<Integer> li2 = new ArrayList<>();
        //li2.add(5);
        //li2.add(6);
        //li2.add(7);
        li2.addAll(li);
        System.out.println(li2);
        System.out.println(" Contains " + li2.containsAll(li));

        // to get the element at a specified index
        System.out.println(li2.get(4));

        // accepts values
        System.out.println(li.indexOf(8));
        System.out.println(li.lastIndexOf(8));

        System.out.print("Size " + li.size());

        // now index 0 is replaced by 10
        li.set(0, 10);
        System.out.println(li);

        System.out.println();
        // iterating
        for (int i = 0; i < li.size(); i++) {

            // System.out.println(li[i]);
            //                       ^ error
            //                       | 
            //                   In list i can't use [ ] ( Subscript operator ) on ArrayList to access the elements

            System.out.print(li.get(i) + " ");
        }
        System.out.println();
        for (Integer x : li) {
            System.out.print(x + " ");
        }

        // tip     can also be written as
        System.out.println("Using var");
        for (var x : li) {
            System.out.print(x + " ");
        }

        System.out.println();

        // iterator
        System.out.println("\nUsing iterator");
        for (var x = li.iterator(); x.hasNext();) {
            System.out.print(x.next() + " ");
        }

        System.out.println();
        System.out.println();
        Iterator<Integer> it = li.iterator();

        System.out.println("\nUsing iterator with while loop\n");
        // is the next element there ?
        //           ↑
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }

        System.out.println("\n\nUsing forEach\n");
        // Lambda expression
        li.forEach((x) -> {
            System.out.println(x);
        });


        // method reference
        System.out.println("\nUsing forEach with method reference\n");

        // Returns a list iterator over the elements in this list 
        //                                  ↓
        ListIterator<Integer> it2 = li.listIterator();

        // Iterator can also be used ( make sure to add ListIterator and in the end listIterator()  , check spelling carefully  )
        //Iterator<Integer> it2 = li.iterator();
        // Q      As long as there is a next element, print it
        //          ↑
        while (it2.hasNext()) {
            // give current element than move to next element
            System.out.println(it2.next());

            // Iterator methods
            // it has methods such as
            // next() , hasNext() , remove() , equals()

            // listIterator() methods and Iterator methods as well
            //next() returns the next element in the iteration.
            //hasNext() returns true if the iteration has more elements.
            //remove() removes the last element returned by the iterator. It can be called only once per call to next().

            // nextIndex() returns the index of the element that would be returned by a subsequent call to next().
            // previous() returns the previous element in the iteration.
            // previousIndex() returns the index of the element that would be returned by a subsequent call to previous().
            
            
        }

    }
}
