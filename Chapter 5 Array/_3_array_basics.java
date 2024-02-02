public class _3_array_basics {
    // imp       1 > array objects are in heap memory
    //           2 > heap objects are not continous
    //           3 > Dynamic memory allocation

    public static void main(String[] args) {

        // r         by default for an integer array default value is 0
        int[] no = new int[10];
        System.out.println(no[0]);

        // for string its showing null means value is not known
        String[] arr = new String[10];
        System.out.println(arr[0]);

        // w      int num= null;  
        // it wont work on primitives null only works for non primitives

        // tip     : stack is use to store primitives while heap is used to store objects and arrays stuff etc 
    }
}
