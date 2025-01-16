//package Inheritance;

// fix      i dont know how but java file access to parent and its subfolders too 

public class Main_for_inheritance_1 {
    // Inheritance is a mechanism that allows us to eliminate redundant code in our applications.

    /* ->   Inheritance  
    to inherit attributes and methods from one class to another. 
    We group the "inheritance concept" into two categories:
    
                    *    subclass (child) - the class that inherits from another class
                    *    superclass (parent) - the class being inherited from To inherit from a class, 
                                                use the extends keyword.
     */

    //  reusing the code in the UIControl class in the TextBox class.
    //  We can do this by inheriting from the UIControl class.
    // this is called inheritance
    public static void main(String[] args) {
        //  1 >  
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
        // ->    go to UIControl class to get more info about the extends Objects
        //      it gives us all the methods of Object class such as toString(), hashCode(), equals() etc.
        //      thats why i can use toString() method here or any other method of Object class
        //      by default every class in java is inherited from Object class 
        // now we can use the methods of UIControl class in TextBox class

        System.out.println();

        var textBox = new TextBox();
        textBox.setText("Rakesh Singh");
        System.out.println(textBox.getText());
        textBox.clear();
        System.out.println(textBox.getText());
        textBox.enable();
        System.out.println(textBox.isEnabled());

        // its by default inherited from Object class so if we dont use extends Object we can still use it
        System.out.println(textBox.hashCode());
// -------------------------------------------------------------------------------------------------------------------
        // 2 >   method overriding

        // imp      it will return "I am a TextBox" as i have overrided the toString() method in TextBox class
        System.out.println(textBox.toString());
        System.out.println();
// -------------------------------------------------------------------------------------------------------------------

        // 3 > 
        var obj = new Object();
        var obj2 = new Object();
        obj2 = obj;
        // some methods of Object class
        //Returns a hash code value for the object
        System.out.println(obj.hashCode());

        // because obj and obj2 are pointing to the same object
        System.out.println("Equals " + obj.equals(obj2));
        // if removed line 41 then it will return false

        // same hashcode as both are pointing to the same object
        System.out.println(obj2.hashCode());

        // String representation of the object
        // it contains the class name and the hashcode of the object ( it is represented in Hexa Decimal), seperated by @
        System.out.println(obj2.toString());

        // same as above because toString() method is there in println() method
        System.out.println(obj2);
    }

}
