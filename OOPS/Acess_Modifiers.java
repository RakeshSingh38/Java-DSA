/* r        
        The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

        We divide modifiers into two groups:

        Access Modifiers - controls the access level
        Non-Access Modifiers - do not control access level, but provides other functionality
 */

/* imp      
        For classes, you can use either public or default:

        Modifier	Description	Try it
        public	The class is accessible by any other class
 */

// For attributes, methods and constructors, you can use the one of the following:

/* 
    -→   public	The code is accessible for all classes	
    -→   private	The code is only accessible within the declared class	
    -→   default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
    -→   protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter

 */
public class Acess_Modifiers {
    public static void main(String[] args) {
        // i already know about final
        System.out.println("hi");
    }
}
