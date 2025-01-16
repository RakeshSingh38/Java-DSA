public class Main_for_constructor_2 {
    public static void main(String[] args) {
        // imp       traditional method    🥲🥲
        //        Constructor_2 oldConstructor = new Constructor_2();
        //        oldConstructor.setName("Rakesh");
        //        System.out.println(oldConstructor.getName());

        //        oldConstructor.setId(60);
        //        System.out.println("ID is "+oldConstructor.getId());

        //        oldConstructor.setAge(23);
        //        System.out.println("Age is "+oldConstructor.getAge());

        // imp      Constructor method      💪💪
        // here we define all of the above value in constructor itself
        var newConstructor = new Constructor_2("Rakesh", 61, 23);
        System.out.println(newConstructor.getName());
        System.out.println("ID is " + newConstructor.getId());
        System.out.println("Age is " + newConstructor.getAge());


        printName("Rakesh Singh");
    }
    public static void printName(String name){
        System.out.println(name);
    }
}
