public class Main_for_inheritance_2 {
    // Inheritance is a mechanism that allows us to eliminate redundant code in our applications.

    // The super keyword refers to superclass (parent) objects.

    //It is used to call superclass methods, and to access the superclass constructor.

    //The most common use of the super keyword is to eliminate the confusion between superclasses
    //                                               and subclasses that have methods with the same name.
    public static void main(String[] args) {
        // see      uncomment the following lines to see the inheritance in action
        //var textBox = new TextBox();

        // tip      best practise 
        // when i run this file i get:
        // UIControl
        // TextBox

        // imp       only method is here not the field
        //new UIControl(true).isEnabled;

        // to fix this i can use protected UIControl line 5 instead of private
        // Stay away from default access modifier as much as possible

        // protected in action  . as the field is boolean i am going to store it in a variable boolean
        boolean enabled = new UIControl_2(true).isEnabled;
        System.out.println(enabled);
    }
}
