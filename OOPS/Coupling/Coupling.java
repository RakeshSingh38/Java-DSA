public class Coupling {
    // Coupling = the dependency of one class on the other
    // when we have a java file that has thousand of class changing one class can cause harm to other class
    // for example we dont want a method to be used by other java file so we use coupling
    //  what i have to do is make the class which i am not using as private so others cant access it outside the class

    private int id;
    //private int age;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    // imp      uncomment this to see the error
    // for Coupling what we do is make it private so it cant be used by other class and hence reduce complexity

//    private void setAge(int age) {
//        this.age = age;
//    }
//
//    private int getAge() {
//        return age;
//    }

}
