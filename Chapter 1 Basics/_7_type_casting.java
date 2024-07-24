
public class _7_type_casting {

    // Things to keep in mind
    // imp      1 > type compatible
    //                 ↑___ → means int -> float possible but int -> boolean is not possible 
    //                                      numbers can be converted to numnbers only

    //           2 > Destination > source type
    public static void main(String[] args) {

        // imp   Type casting is when you assign a value of one primitive data type to
        // another type.

        // * In Java, there are two types of casting:

        // * Widening Casting (automatically) - converting a smaller type to a larger
        // type size
        // * byte -> short -> char -> int -> long -> float -> double
        // imp   int to double works
        int myInt = 5;
        double myNum = myInt;

        System.out.println(myInt);
        System.out.println(myNum);

        // ->    But vice versa won't works
        double myN = 21;
        // int myB = myN;

        // see      
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        // to make it work use
        int myB = (int) myN;
        System.out.println(myB);

        //dobule
        double ts = 128;
        System.out.println((byte) ts);
        //              System.out.println((int)myB);
        // fix      While printing (type casting) is not working
        // u have to assign it to a variable to make it work

    }
}
