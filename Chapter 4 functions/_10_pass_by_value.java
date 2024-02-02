public class _10_pass_by_value {

    // r     tips : java works on pass by value not on pass by references
    public static void main(String[] args) {
        String name = "Rakesh k";
        greeting(name);
        System.out.println(name);

    }

    static void greeting(String naam) {
        naam="singh";

        // r     in case of swap value we dont create any new object instead we just assign it to other but here we are creating

        // ->     not changing , but creating a new object 

        // see     its scope (life) is in this function only so it  won't matter outside the function 
    }

}