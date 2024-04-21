//public class _15_largestCommonPrefix {
//    public static void main(String[] args) {
//        String[] str = { "flight", "flower", "flow" };
//        System.out.println(largestCommonPrefix(str));
//    }
//
//    public static String largestCommonPrefix(String[] str) {
//        if (str == null || str.length == 0) {
//            return "";
//        }
//
//        String prefix = str[0];
//
//        for (int i = 1; i < str.length; i++) {
//            System.out.println(prefix);
//            prefix = prefix.substring(0, str.length - 1);
//            while (str[i].indexOf(prefix) != 0) {
//                if (prefix.isEmpty())
//                    return "";
//            }
//        }
//        return prefix;
//    }
//}