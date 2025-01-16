
public class Main1 {
    public static void main(String[] args) {

        // without getter and setter vali zindagi
        var myObj = new Encapsulation();
        // error :   myObj.name = "Rakesh";
        // w     error: name has private access in Encapsulation 

        // r        hence using getter and setter makes more sense

        // ✅ now its working i can set input and get output
        myObj.setName("Rakesh");
        System.out.println("Name is " + myObj.getName());
        myObj.setId(60);
        System.out.println("ID is " + myObj.getId());
        // tip        on the variable press Ctrl + . to open the bulb and down there u will get setters and getters
    }
}
