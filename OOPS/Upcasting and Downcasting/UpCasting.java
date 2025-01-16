
// ->   Upcasting: Referred to as "widening", Upcasting is the process of converting a subclass reference into a superclass 
//           reference. It's absolutely safe and performed automatically by Java (IC = Impplicitly) because a subclass is an instance 
//              of its superclass.
// For eg:
// ->      if 'Dog' is a subclass of 'Animal', any dog is fundamentally an animal, making upcasting a logical operation.

// but 
//  you can only access the methods and fields declared in the superclass and not those specific to the subclass

//  Implicit = Done by Java , Explicit = Done by Programmer

// error :    if i write below lines inside main method
//    then i have to make this class as static else error 
class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

// no parameters
class dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

// no parameters
class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

public class UpCasting {

    public static void main(String[] args) {
        //  Syntax of Upcasting  ✅✅
        //     Parent obj = new Child();
        Animal a; // Reference of a superclass
        a = new Dog(); // Upcasting ( Dog is automatically upcasted to Animal )
        a.sound(); // call the method of Dog class
        a = new Cat(); // Upcasting ( Cat is automatically upcasted to Animal )
        a.sound(); // call the method of Cat class
    }
}
/* r       code demonstrates that when a subclass object is upcast to a superclass, the actual type of the object 
(not the reference type) determines which method is called. 
This is a fundamental concept in Java known as dynamic method dispatch or runtime polymorphism. */