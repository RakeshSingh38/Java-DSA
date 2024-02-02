import java.util.Random;

public class Global {
    // global variable
    // imp     for global variables, we dont need to initialize them , we declared them outside of the method but within the class
    Random random;
    int number = 0;

    Global() {

        // global variable
        random = new Random();
        roll();

    }

    // global variable

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println("\n Global variable is "+number);
    }

    //two ways to fix this
    //1. pass number as a parameter to roll method ( local variable )
    //2. make number a global variable 
    //number=random.nextInt(6)+1;System.out.println(number);
}
