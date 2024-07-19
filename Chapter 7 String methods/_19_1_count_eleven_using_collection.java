//package Chapter 7 String methods;

import java.util.Arrays;
import java.util.List;

public class _19_1_count_eleven_using_collection {
    public static void main(String[] args) {
        List<Integer> count = Arrays.asList(1, 2, 3, 4, 11, 11, 11, 10);

        System.out.println(count);

        // shorter way using Java 8 Streams
        long a = count.stream().filter((i) -> i == 11).count();
        System.out.println(a);

        // using traditional for loop
        String str = count.toString();
        char[] ans = str.toCharArray();
        System.out.println("-------------");
        System.out.println(str);
        System.out.println(str instanceof String);

        System.out.println(ans);
        System.out.println(ans.getClass().getSimpleName());
        System.out.println("-------------");
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                cnt++;
            }
        }
        // r        i can also use str.indexOf("11");
        int index = 0;
        int cntt=0;
        while ((index = str.indexOf("11", index) )!= -1) {
            cntt++;
            index+=2;
        }
        //System.out.println(index);
        System.out.println(cntt);

        System.out.println(cnt);
    }
}
