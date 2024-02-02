
public class _3_Find_a_number_using_Math_method {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 101) {
            int max = (int) (Math.random() * 101);
            //int num = 0;

            System.out.println("number is " + max);
            if (max == 52) {
                System.out.println("number founded ------------ " + max);
                max++;
                break;
            }
            System.out.println("i =  " + i);
            i++;
        }
    }
}
