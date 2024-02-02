enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    public static void main(String[] args) {
        // here u can write LOW, MEDIUM, HIGH
        var myLevel = Level.MEDIUM;
        // or

        //System.out.println(myLevel);

        // Using switch statements
        switch (myLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;

        }
        // Using for loop
        // imp      values() method returns an array containing all the values of the enum. 
        // its a built in method for enums in java
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}