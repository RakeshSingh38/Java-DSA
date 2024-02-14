// Q       pattern to count numbers continuosly
public class _7_1_pattern_counting_numbers {
    /* 
    
    1
    23
    456
    
     */
    public static void main(String[] args) {
        int no_of_stars = 1;
        int num = 3;
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= no_of_stars; j++) {
                System.out.print(count);
                count++;
            }
            no_of_stars++;
            System.out.println();
        }
        /*        int no_of_stars = 1;
        int num = 3;
        int count = 1;
        int i = 1;
        int j = 1;
        while (i <= num) {
            while (j <= no_of_stars) {
                System.out.print(count + " ");
                j++;
                count++;
            }
            no_of_stars++;
            i++;
            System.out.println();
        }*/
    }

    /* 
    int nst = 3;
    for (int i = 1; i <= nst; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    */
}
