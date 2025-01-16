public class Static_VS_Public {

    //  the constructor is called when the object is created.
    //   constructor dont have any return type i.e void , int , String etc
    public Static_VS_Public(){
        System.out.println("");
    }

    // static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating its objects");
    }

    // public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    // tip    The dot (.) is used to access the object's attributes and methods.
    
    
    // imp       To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).


    public static void main(String[] args) {
        // static method can be called directly ✅
        myStaticMethod();

        // public methods must be called by creating objects 😅
        // myPublicMethod(); ❌ 
        var myObj= new Static_VS_Public();
        myObj.myPublicMethod();
    }


}
