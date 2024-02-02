// Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces 

/* 
The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
 */
abstract class Animal {
    // implements an abstract method
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }

}

class Cat extends Animal {
    // follows the rules of an abstract class
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

public class classes {

    public static void main(String[] args) {
        // w        not possible to create an object of the Animal class
        //           ↓      
        //          var myObj = new Animal();

        // we cannot create objects of an abstract class




        // To access the abstract class, it must be inherited from another class
        var myCat = new Cat();
        myCat.animalSound();
        System.out.println();
        myCat.sleep();
        // Q     Why And When To Use Abstract Classes and Methods?
        // r     To achieve security - hide certain details and only show the important details of an object. 
    }
}
