import java.util.Arrays;
// imp     length is not constant it varies with inputs

// ->     In javaScript i know it as Spread operator
public class _14_varArguments {

    public static void main(String[] args) {
        heyy(2, 3, 4, 5, 6, 6);
        heyy(2, 8, "rakesh", "singh");
    }



    static void heyy(int... v) {
        System.out.println(Arrays.toString(v));
    }
//          
//                          
//                             This should always comes at end (Variable arguments) 
//                                            |  
//                                            ↓  
    static void heyy(int a, int b, String...v) {
        
        
        System.out.println(Arrays.toString(v));
    }
}
