/* 
Another way to achieve ab

An interface is a completely "abstract class" that is used to group related methods with empty bodies:
 */
interface Animals {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Cats "implements" the Animals interface
class Cats implements Animals {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

}

// w        dont know why but interfaces must be written as interfacess to be working
public class interfacess {

    public static void main(String[] args) {
        // Create a Cats object
        Cats myCat = new Cats();
        myCat.animalSound();
        myCat.sleep();
    }
}
