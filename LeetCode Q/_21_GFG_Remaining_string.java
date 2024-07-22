public class _21_GFG_Remaining_string {
    public static void main(String[] args) {

        // learnt about the substring method
        String str = "thisisjava";
        System.out.println(afterIStringis(str, 'i', 2));

        System.out.println("\nmain str");
        System.out.println(str.substring(4 + 1));
    }

    static String afterIStringis(String str, char ch, int count) {
        //char[] ans = str.toCharArray();
        // TC : O(n) , SC : O(1)
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt++;
                if (cnt == count) {
                    return str.substring(i + 1);

                    // or

                    //for (int j = i+1; j < str.length(); j++) {
                    //    System.out.print(str.charAt(j));
                    //}

                    // or

                    //StringBuilder result = new StringBuilder();
                    //for (int j = i + 1; j < str.length(); j++) {
                    //    result.append(str.charAt(j));
                    //}
                    //return result.toString();
                }
            }
        }
        return "";

        // or

        /*  
        //      TC : O(n) , SC : O(n)
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt++;
                if (cnt == count) {
        
                // tip      we can also use string builder
                    StringBuilder result = new StringBuilder();
                    for (int j = i + 1; j < str.length(); j++) {
                        result.append(str.charAt(j));
                    }
                    return result.toString();
                }
            }
        }
        return "";*/

        // or
        // TC : O(n) , SC : O(1)
        /* int index = -1;
        for (int i = 0; i < count; i++) {
            index = str.indexOf(ch, index + 1);
            if (index == -1) {
                return "";
            }
        }
        return str.substring(index + 1);*/
    }
}
