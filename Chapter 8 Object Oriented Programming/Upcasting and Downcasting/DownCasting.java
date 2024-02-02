/* imp      
Downcasting is a process that involves transforming a superclass reference into a subclass reference. 
Contrary to upcasting, downcasting, often called "narrowing", is not performed automatically and is potentially unsafe. 
It can lead to a ClassCastException if the object being downcasted is not actually an instance of the subclass.
 */

// Downcasting is the opposite of upcasting, which is casting a superclass to a subclass.
// Explicit conversion is done by the programmer.
class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

// no parameters
class Dog extends Animal {
    void barking() {
        System.out.println("Dog is barking");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        // Syntax of Downcasting   ✅
        //          Parent obj = new Child();
        //          Child c1 = (Child)p1;
        Animal a = new Dog(); // upcasting
        Dog d = (Dog) a; // downcasting
        d.sound(); // calling the Animal class method
        d.barking(); // calling the Dog class method
    }
}
