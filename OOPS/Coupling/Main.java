 class Main_3 {
    public static void main(String[] args) {
        // here we define all of the above value in constructor itself
        var newConstructor = new Coupling();

        // uncomment this to see the error and uncomment the method in Coupling.java line 8 and line 20 to 26 to see the error
        // imp       error: The method getAge and setAge from the type Coupling is not visible
        // reason: because we have made it private
        // r     this is how we use coupling when i press " Ctrl + Space " i cant see the method

        //newConstructor.setAge(23);
        //System.out.println("Age is " + newConstructor.getAge());

        newConstructor.setId(60);
        System.out.println("ID is " + newConstructor.getId());
    }
}
