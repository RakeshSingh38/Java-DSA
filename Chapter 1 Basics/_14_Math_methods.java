
public class _14_Math_methods {
    public static void main(String[] args) {
        //The Java Math class has many methods that allows us to perform mathematical tasks on numbers

        // ->     The Math.max(x,y) method can be used to find the highest value of x and y:

        System.out.println("Maximum number is " + Math.max(5, 10));

        // The Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println("Minimum number is " + Math.min(5, 10));

        // The Math.sqrt(x) method returns the square root of x:
        System.out.println("Square root of 81 is " + Math.sqrt(81));

        // The Math.abs(x) method returns the absolute (positive) value of x ( its converts negative number to positive thats it )
        System.out.println("Absolute number is " + Math.abs(-4.7));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 by default
        // we can change it to give specific range of numbers
        // Already seen in JavaScript
        //System.out.println("Random number is " + Math.random());
        // i have modified Math.random 
        //System.out.println("Random number is " + (int) (Math.random() * 101));
        //int num = 100;
        //int max=100;
        //System.out.println(max);
        //int max = (int) (Math.random() * 101);
        //System.out.println(max);
        //for (int i = 1; i <= max; i++) {
        //    //if (i == 52) {
        //    System.out.println(i);
        //    if (i == 52) {
        //        System.out.println("52 founded");
        //        break;
        //    }
        //}
        int i = 0;
        while (i <= 101) {
            int max = (int) (Math.random() * 101);
            //int num = 0;

            System.out.println("number is " + max);
            if (max == 52) {
                System.out.println("number founded ------------ " + max);
                max++;
                break;
            }
            System.out.println("i =  " + i);
            i++;
        }
        //        while (num<5) {
        //            int sec=0;
        //            if (sec == 52) {
        //                System.out.println("Number 52 is found ");
        //                break;
        //
        //            } 
        //            num++;
        //            //break;
        //        }

    }
}
