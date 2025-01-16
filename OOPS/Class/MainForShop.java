package OOPS.Class;

public class MainForShop {
    public static void main(String[] args) {
        // to use a class, we need to create an object of that class

        // syntax: className objectName = new className();
        // imp   to make it readable we can write Shop as var and let java compiler do its job
        // in the ShopforClass i already defined all the variables and methods 
        // there are no arguments in the constructor so we can directly create an object of the class
        ShopforClass myShop = new ShopforClass();
        //        or
        //  var myShop = new Shop();
        // myShop is an object of type Shop

        // objectName is a variable of type className 

        // r    to use classes , constructor or objects make sure to add the class file in the same folder as the main file
        //         For OOPS in Vscode , add path to the .vscode folder which is in parent directory where ever u opened vscode u will get a .vscode folder
        // ->       add here .vscode -> settings.json ->  "java.project.sourcePaths"=  add the path here 
        //         then only it will work else it will show error
        // w       ClassName cannot be resolved to a type

        System.out.println("Customer orders " + myShop.dishName);
        System.out.println("Customer likes " + myShop.taste + " taste");
        System.out.println("Customer likes " + myShop.type + " dish");
        System.out.println("Customer pays " + myShop.price + " rupees");
        System.out.println();
        System.out.println("\tMethds in Shop class are: ");
        System.out.println();
        System.out.println("MainForShop.main");
        // to access methods of a class, we use the objectName
        myShop.customerEats();
        myShop.customerPays();

        System.out.println();
        // what i have written above is an object of type Shop
        // like this we can create many objects ( instances ) of a class
        ShopforClass myShop2 = new ShopforClass();
        System.out.println("customer orders " + myShop2.dishName + " on myShop2");

        ShopforClass myShop3 = new ShopforClass();
        System.out.println(myShop3);

    }
}
