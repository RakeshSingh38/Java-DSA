
public class Encapsulation {

    /* imp      Encapsulation
        The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    
    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
    
    // ->        theory
    
    The get method returns the value of the variable name.
    
    The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.
    
    However, as the name variable is declared as private, we cannot access it from outside
    
    Why Encapsulation?
    -->          Better control of class attributes and methods
    -->          Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    -->          Flexible: the programmer can change one part of the code without affecting other parts
    -->          Increased security of data
     */
    private String name;
    private int id;
    private int age;

    /**
     * @param age the age to set
     */

    //getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // for Coupling what we do is make it private so it cant be used by other class and hence reduce complexity
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //public void setName(String name) {
    //    this.name = name;
    //}

}
