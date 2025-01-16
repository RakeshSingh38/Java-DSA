package OOPS.Constructor;

public class Main {
    public static void main(String[] args) {

        //Human(String name, String gender, int age, String height) {
        Human human = new Human("Rakesh Singh", "Male", 23, "5'7");

        // we get null values because we have not assigned any values to the variables
        System.out.println(human.name);
        // imp       to create different objects that have different attributes we use constructor
        //System.out.println(human.name);

        System.out.println();
        // creating another object Human
        Human human2 = new Human("Nikesh Singh", "Male", 18, "5,11");
        System.out.println(human2.name);
        System.out.println();

        //System.out.println(human2.eats());
        human.eat();
        //human2.eat();
        human2.sleep();
    }
}
