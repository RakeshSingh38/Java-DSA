
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

// above code can be combined as
import java.util.*;
import java.util.stream.Collectors;

// imp      In Java, the term "collection" refers to a group of objects. 
class _1_Array_list {
    public static void main(String[] args) {
        // not dynamic in size
        String[] array = new String[10];
        array[0] = "Rakesh";
        array[1] = "Nikesh";
        array[2] = "Suresh";

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
        }

        // dynamic in size
        List<String> list = new ArrayList<String>();

        // it will create n+n/2+1 size of array
        //                10+(10/2)+1 = 16 
        // if we add 10 elements then it will create 16 size of array
        list.add("Rakesh");
        list.add("Nikesh");
        list.add("Suresh");

        //for (String string : list) {
        //    System.out.println(string);
        //}
        System.out.println((list));
        // ----------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("List 1");
        // imp     List is an interface whereas ArrayList is the implementation class of List.

        // List is a collection of elements in a sequence where each element is an object and elements are accessed by there position (index).
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        // here values are right shifted as bts internally its happening
        list2.add(9);
        // now index 3 is replaced by 60 
        list2.add(2, 60);

        // --------------------------------------------------------------------------------------------------------------
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list2.addAll(list3);
        // now list2 has list2 elements and list3 elements
        System.out.println(list2);

        // to get the element at a specified index 
        System.out.println(list2.get(2));

        // to remove an element from the list by index
        //System.out.println(list2);
        list2.remove(3);
        System.out.println(list2);

        // to remove an element from the list by type eg: Integer then we have to use wrapper class Integer.valueOf(7)
        // The valueOf method is essentially used to convert the primitive value 7 to an Integer object so that it can be properly handled by the remove method, which operates on objects rather than primitive types.

        // remove element of type Integer and its value of 7 from the list
        list2.remove(Integer.valueOf(7));

        //list2.clear();
        System.out.println();
        System.out.println("New List 2");
        System.out.println(list2);

        // i wanted to update an element at a specified index

        // now index 4 is replaced by 100 ( remember arrays have 4-1 index so its 3rd index)
        list2.set(4, 100);
        // as we can see index is n-1 so 4-1 = 3rd index
        System.out.println(list2.get(3));

        // test             to check the element
        System.out.println(list2.get(4));

        // imp   toString method is invoked automatically when we print the list
        System.out.println(list2);
        // both are same        ↑    it hides the complexity of the code
        //System.out.println(list2.toString());

        // time complexity of get method is O(n) 
        System.out.println("\n");
        // to check if the list contains an element return true if values is present else false
        System.out.println("Is the list contains the value 100 ? " + list2.contains(100));

        System.out.println("\nFor loop is \n");

        // imp       to iterate list 1 > for loop
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("The elements are " + list2.get(i) + " at index " + i);
        }
        System.out.println("\nFor each loop is \n");

        // 1.1 >   regular for loop
        System.out.println("Regular for loop is \n");
        for (int i = 0; i < list.size(); i++) {

            // System.out.println(li[i]);
            //                       ^ error
            //                       | 
            //                   I can't use [] ( Subscript operator ) on ArrayList to access the elements

            System.out.println(list.get(i));
        }

        // 2 > for each loop
        System.out.println("\nIterator is \n");
        System.out.println("The elements are ");
        //for (Integer integer : list2) {

        System.out.println("Using var we can also write as \n");
        for (var x : list) {
            System.out.print(x + " ");
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");

        //}
        // 3 > iterator
        // iterator is an interface
        // iterator is used to iterate over a collection

        // if hasNext has any values then print th e iterator with the next method
        System.out.println("\nIterator using while loop");

        Iterator<Integer> it = list2.iterator();

        //   is the next element there ?
        //           ↑
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        System.out.println("\nIterator Converted to for loop");
        // above code is same as below
        for (Iterator<Integer> it2 = list2.iterator(); it2.hasNext();) {
            System.out.print(it2.next() + " ");
        }

        System.out.println("\n\nIterator using forEach loop");
        list2.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nIterator using forEach loop with method reference");
        // same as above
        list2.forEach(System.out::println);

        // forEach using function
        System.out.println("\nforEach using function");
        list2.forEach(n -> show(n));

        // forEach using method reference
        // ...

        System.out.println("\nGetting elements from an array to arrayLists");
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        List<Integer> tempList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<String> list4 = new ArrayList<>(tempList.stream().map(String::valueOf).collect(Collectors.toList()));
        System.out.println(list4);

        int pos = Collections.binarySearch(list4, "3");
        System.out.println(pos);

    }

    static void show(int n) {
        if (n > 6) {
            System.out.print(n + " ");
        }
    }
}
//}
