import java.util.Random;

public class Local {
    Local() {
        // local variable
        Random random = new Random();
        int number = 0;
        roll(random, number);

        // 1st way to fix
        // we pass variable names as parameters to methods to access them inside the method 

    }

    // see     press Ctrl + k to uncomment all

    // local variable

    void roll(Random random, int number) {

        /* imp     at this point, number is a local variable
        it is not accessible outside of this method, constructor, main method, other method
        it is only accessible inside this method*/

        // // fix      

        /* roll doesnt have access to Ludo constructor's number variable
        
        /* two ways to fix this
        1. pass number as a parameter to roll method ( local variable )
        2. make number a global variable*/
        number = random.nextInt(6) + 1;
        System.out.println(" Local variable is "+number);
    }
}
