
public class Array_of_objects_type1 {
    public static void main(String[] args) {
        //int[] numbers = new int[5];
        //char[] characters = new char[5];
        //String[] strings = new String[10];

        college[] institute = new college[3];

        college obj = new college("SIGCE");
        college obj2 = new college("Rakesh Singh");
        college obj3 = new college("Roll no 60");

        institute[0] = obj;
        institute[1] = obj2;
        institute[2] = obj3;

        // if i wrote like this it will show the address of the object where it is stored
        // -> 
        //System.out.println(institute[0]);

        System.out.println(institute[0].name);
        System.out.println(institute[1].name);
        System.out.println(institute[2].name);

    }
}
