
public class Friend {
    //    Things an object knows about itself are called
    //      ✅ instance variables
    
    //Things an object can do are called
    //      ✅ methods
    
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("you have " + numberOfFriends + " friends");
    }

    // to use println, we need to return a String
    /*  static String  displayFriends(){
        return ("you have " +numberOfFriends+ " friends");
    }*/
}
