public class Non_Acess_Modifiers {

    // learn about coupling , abstraction , OOPS etc
    public static void main(String[] args) {
        //Non-Access Modifiers - do not control access level, but provides other functionality

        /*      Non-Access Modifiers
        
        For classes, you can use either final or abstract:
            
        Modifier	                    Description	
        final	        The class cannot be inherited by other classes 
        abstract	    The class cannot be used to create objects                 */

        /*  For attributes and methods, you can use the one of the following:
        
        Modifier	                                Description
        
        --→   final	            Attributes and methods cannot be overridden/modified   ✅
        --→   static	        Attributes and methods belongs to the class, rather than an object  ✅
        --→   abstract	        Can only be used in an abstract class, and can only be used on methods. 
                                The method does not have a body, for example abstract void run();. 
                                The body is provided by the subclass (inherited from).
        --→   transient	        Attributes and methods are skipped when serializing the object containing them
        --→   synchronized	    Methods can only be accessed by one thread at a time
        --→   volatile	        The value of an attribute is not cached thread-locally,
                                and is always read from the "main memory"
        
        */

        /*    Abstract
                An abstract method belongs to an abstract class, and it does not have a body.
                    The body is provided by the subclass: */

            //abstract class Test{
            //    public String name = "Rakesh";
            //    public int age = 23;
            //}
    }
}