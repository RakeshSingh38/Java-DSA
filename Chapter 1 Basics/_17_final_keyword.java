
public class _17_final_keyword {
    public static void main(String[] args) {
        double pi= 3.14;
        pi=4;   // pi value is changed
        System.out.println(pi);

        {

            final double PI=3.14;
            // cannot change the value of PI as it is final
            // i.e final variables are constants and cannot be assigned
            // tip      comman practise is we use all capital letters for final variables
            //PI=4;
            System.out.println(PI);
        }
        
    }
}
