
// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
// Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.

// For example, think of a superclass called Animal that has a method called animalSound(). 
// Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound
// (the pig oinks, and the cat meows, etc.):

// imp      implements vs extends
// extends keyword to inherit attributes and methods from a class.
// implements keyword to inherit from an interface.
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

class Polymorphism {

    public static void main(String[] args) {
        var myAnimal = new Animal();
        var myCat = new Cat();
        var myDog = new Dog();

        myAnimal.animalSound();
        System.out.println();
        myCat.animalSound();
        System.out.println();
        myDog.animalSound();
    }
}