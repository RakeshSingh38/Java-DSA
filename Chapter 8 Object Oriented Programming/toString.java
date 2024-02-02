
public class toString {

    // toString() method is used to textually represent an object
    // it can be used implicitly or explicitly

    public static void main(String[] args) {
        Car car = new Car();
        // if i used toString() method without callling the toString function i wrote in Car.java
        // it will print the hashcode of the object

        // imp       uncomment the below line to see the address of the car
        //          this is an explicit method
        System.out.println(car.toString());

        // ->       this will print the address of the car object stored in the memory
        //          Car@28a418fc consider it as an address like our home address

        //          implicitly it will call the toString() method
        System.out.println(car);

    }
}
