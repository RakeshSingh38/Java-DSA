public class Static {
    // Java program that demonstrates the use of static fields and methods in a class
    // the class owns the static member 

    // imp       the below i created are instance ( line 12 to 15 ) 
    //               when i used static members i dont have to create an object to access them
    // example   Friend.numberOfFriends

    // r        eg :-   Integer.parseInt("123");  // here parseInt is a static method of Integer class
    //                                             // thats why i dont have to create an object to access it
    public static void main(String[] args) {

        // Cannot make a static reference to the non-static field Friend.name
        //System.out.println(Friend.name);

        var friend1 = new Friend("Nikesh");
        var friend2 = new Friend("K");
        var friend3 = new Friend("Sukesh");
        var friend4 = new Friend("Mukesh");

        {
            System.out.print(friend1);
            System.out.print(friend2);
            System.out.print(friend3);
            System.out.print(friend4);
        }
        System.out.println("\n\n");
        // as we can see, we can access the static field Friend.numberOfFriends
        // without creating an instance of Friend
        // i can see the default value of int as 0
        // imp     if i dont create instances of Friend, the value of numberOfFriends will be 0  i.e line 7 
        System.out.println("Number of friends " + Friend.numberOfFriends);

        // tip    sop(Friend.displayFriends());  // this will not work

        //In Java, methods with a void return type don't return a value, so there's nothing to print.
        // imp     The displayFriends() method already includes a print statement (System.out.println("you have " +numberOfFriends+ " friends")), 
        //so you don't need to wrap it in another System.out.println(). 

        // fix     uncomment to see the error to
        //         to display below line uncomment line 16 to 18 and comment line 11 to 13 in Friend.java
        //System.out.println(Friend.displayFriends());

        Friend.displayFriends();

        System.out.println();
    }
}
