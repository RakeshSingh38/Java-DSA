import java.util.Scanner;

public class LongestRepetition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.next();

        int max_length = 0;
        int current_length = 1;

        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                current_length++;
            } else {
                max_length = Math.max(max_length, current_length);
                current_length = 1;
            }
        }

        max_length = Math.max(max_length, current_length); // Check for the last repetition

        System.out.println(max_length);
        sc.close();
    }
}

//import java.util.Scanner;
//
//public class _5_Repetitions {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//
//        char[] s = n.toCharArray();
//        long l = 0;
//        for (int i = 0; i < n.length(); i++) {
//            char c = s[i];
//
//            switch (c) {
//            case 'A':
//                l++;
//                break;
//            case 'C':
//                l++;
//                break;
//            case 'G':
//                l++;
//                break;
//            case 'T':
//                l++;
//                break;
//            default:
//                break;
//            }
//        }
//        System.out.println(l);
//        sc.close();
//    }
//}