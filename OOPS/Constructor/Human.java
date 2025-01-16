package OOPS.Constructor;


public class Human {

    // These are called instance variables because they are created inside a class and are not inside any method
    // These variables are accessible to all the methods inside the class

    // r    These variables are also called fields, 
    // attributes, properties, data members
    String name;
    String gender;
    int age;
    String height;

    // A constructor’s name must be exactly the same as the name of its class.
    Human(String name, String gender, int age, String height) {
        // Assigning values to the variables declared above

        // Q     will the below lines will work ?? 
        // w     it wont work because they are local variables 
        /*  
        name = name;
        gender = gender;
        age = age;
        height = height; 
        */
        /* r        The variables on the left side of the assignment operator should refer to the instance variables, while the variables on the right side should refer to the constructor parameters. To fix this issue, we need to use the this keyword to refer to the instance variables. */
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;

        //name = "Rakesh Singh2";
        //gender = "Male";
        //age = 23;
        //height = "5'7";

        //System.out.println("Constructor called");
    }


    void eat() {
        System.out.println(name + " eats");
        //                  or
        System.out.println(this.name+ " eats");
    }
    void sleep() {
        System.out.println(name + " sleeps");
    }
}
