
public class Main {
    public static void main(String[] args) {
        // to use a class, we need to create an object of that class

        // syntax: className objectName = new className();
        Shop myShop = new Shop();
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
        // to access methods of a class, we use the objectName
        myShop.customerEats();
        myShop.customerPays();

        System.out.println();
        // what i have written above is an object of type Shop
        // like this we can create many objects ( instances ) of a class

        Shop myShop2 = new Shop();
        System.out.println("customer orders " + myShop2.dishName + " on myShop2");
    }
}
