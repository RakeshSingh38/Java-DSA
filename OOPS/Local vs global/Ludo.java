import java.util.Random;

public class Ludo {
    // global variable
    // imp     for global variables, we dont need to initialize them , we declared them outside of the method but within the class
    Random random;
    int number = 0;

    Ludo() {

        // global variable
        random = new Random();
        roll();

        // local variable
        //        {
        //            Random random = new Random();
        //            int number = 0;
        //            //roll();
        //
        //            /*1st way to fix
        //            we pass variable names as parameters to methods to access them inside the method */
        //            roll(random, number);
        //        }

    }

    // global variable

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    // see     press Ctrl + k to uncomment all

    // local variable

    //    void roll(Random random, int number) {
    //        /* imp     at this point, number is a local variable
    //        it is not accessible outside of this method, constructor, main method, other method
    //        it is only accessible inside this method*/
    //
    //        // // fix      
    //
    //        /* roll doesnt have access to Ludo constructor's number variable
    //        
    //        two ways to fix this
    //        1. pass number as a parameter to roll method ( local variable )
    //        2. make number a global variable*/
    //        number = random.nextInt(6) + 1;
    //        System.out.println(number);
    //    }
}
