import java.util.Arrays;
import java.util.Scanner;

public class _5_input_string {
    
    public static void main(String[] args) {
               // see      String array with input

        try (Scanner sc = new Scanner (System.in)) {
            // String inn = sc.next();
            String str[]=new String[5];
            for (int i = 0; i < str.length; i++) {
                str[i]=sc.next();
            }
            str[1]="Rakesh";
            System.out.println("loop to print Strings "+Arrays.toString(str));
            System.out.println();

            // imp      function to change array at index 0
            int nums[]={1,2,3,40};
            change(nums);
            System.out.println("Function to change array is : "+Arrays.toString(nums));
            System.out.println();
        }
        
    }


    static void change(int[]arr){
        arr[0]=99;
    }
}
