
public class Array_of_objects_type2 {
    public static void main(String[] args) {
        //int[] numbers = new int[5];
        //char[] characters = new char[5];
        //String[] strings = new String[10];

        college student1 = new college("SIGCE");
        college student2 = new college("Rakesh Singh");
        college student3 = new college("Roll no 60");

        // can also be written as ↓
        //college[] institute = { obj, obj2, obj3 };

        college[] institute = { student1, student2, student3 };

        System.out.println(institute[0].name);
        System.out.println(institute[1].name);
        System.out.println(institute[2].name);

    }
}
