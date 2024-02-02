
public class _5_forEach {
    // imp      forEach loop is helpful to iterate elements in Array / Collection 
    //          less steps , more readable
    //          less flexible 
    public static void main(String[] args) {
        // for (type variableName : arrayName) {
        // // code block to be executed
        // }
        // String cars[] = { "maruti", "suzuki", "volvo", "bolero" };

        /* tip      forEach loop is read-only, meaning you can't modify the elements of the collection or array
        while iterating over them. If you need to modify elements, you might want to use a traditional for
        loop.  */

        //  For-each loops do not keep track of index
        //  For-each only iterates forward over the array in single steps , it means if we add
        //  another condition in for loop like i+=2 after i++  then it will not work in for-each loop 
        //  For-each cannot process two decision making statements at once i.e nested loop

        // Q      how to read ?   for every items in the cars array, print the items 
        String[] cars = { "maruti", "suzuki", "volvo", "bolero" };
        //           here : means in 
        //                ↓ 
        for (String items : cars) {
            System.out.println(items);
        }

        // normal for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
    }
}