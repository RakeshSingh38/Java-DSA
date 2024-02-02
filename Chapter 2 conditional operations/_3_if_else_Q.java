public class _3_if_else_Q {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult and you can drive");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("You cant drive");
        }
    }
}
