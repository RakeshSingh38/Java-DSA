/* imp      
➢  Lambda expressions are used for de1ining anonymous expressions or nameless methods or functions. 
➢  Lambda expressions are de1ined with the help of interfaces. 
➢  If a interface have single abstract method then it is called the functional interface. 
➢  The lambda expression is ‘->’. ➢These lambda expressions are very powerful and very useful and are very handy and easy for programmers
 */

// Method reference

/*
➢   Method references are either created or de1ined using functional interface. 
➢   :: ‘scope resolution operator in c/c++’ this is the operator used for the referencing. 
➢   In java ' : : ' is used for method reference. 
➢   Any method can be called or referred to by the functional interface with a single method. 
➢   To non-static members method are assigned using objects. ➢Constructor of any class can be assigned as method reference. 
➢   The above method is used to write compact code. ➢Method referencing is more like polymorphism.*/
interface mylambda {
    public void display();
}

public class _1_lambda {
    public static void main(String[] args) {
        // same like arrow functions in js
        mylambda m = new mylambda() {
            public void display() {
                System.out.println("Hello World");
            }
        };
        m.display();
        
        System.out.println("\nLambda expression are same as arrow functionsin JavaScript\n");
        // above code can be written as
        mylambda m2 = () -> {
            System.out.println("Hello World");
        };
        
        // or in simple 1 line
        //mylambda m2 = () -> { System.out.println("Hello World") ; };
        
        m2.display();
    }
}
