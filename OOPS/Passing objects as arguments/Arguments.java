
public class Arguments {
    public static void main(String[] args) {

        // imp      We uses two classes, Garage and Cars, to simulate the action of parking a car in a garage.

        /*  The Cars class is a blueprint for creating car objects. 
            It has one instance variable, name, which represents the name of the car.
            This constructor is used to initialize the name of the car when a new Cars object is created
            
            The Garage class has one method, park, which takes a Cars object as an argument.
            The name of the car is accessed directly from the Cars object passed as an argument
            
            In the main method of the Arguments class, a new Garage object and a new Cars object are created. 
            Then, the park method of the Garage object is called, passing the Cars object as an argument. 
            This results in a message being printed to the console: "The Porche is parked in the garage."*/

        Garage garage = new Garage();

        Cars car1 = new Cars("Porche");
        Cars car2 = new Cars("BMW");

        garage.park(car1);
        garage.park(car2);
    }
}