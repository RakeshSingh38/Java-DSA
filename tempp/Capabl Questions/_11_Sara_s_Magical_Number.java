import java.util.Scanner;
// Sara's Magical Number
// Sara has a magical number. She wants to find out whether the number is magical or not. A magical number is a number which can be expressed as a sum of two consecutive integers and also as a sum of two distinct prime numbers. Help her to find out whether the given number is magical or not.

// Sample Input 1
// 3
// 6
// 7
// 21
// Sample Output 1
// YES  
// NO
// YES
// Explanation
// Test case 1: 6=2+4=3+3. Also, 6=5+1, where 5 and 1 are prime numbers.
// Test case 2: 7=3+4=5+2. Also, 7=2+5, where 2 and 5 are prime numbers.
// Test case 3: 21=10+11=3+18. Also, 21=2+19, where 2 and 19 are prime numbers.
// 
public class _11_Sara_s_Magical_Number {
    static int saraMagicTrick(int A, int B, int X) {
        //
        //int c =((X+(A*2)+B)/2-2);
        X = 4;
        return ((X + (A * 2) + B) / 2 - 2);
    }

    // example : 3 6 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        int result = saraMagicTrick(A, B, X);
        System.out.println(result);
        scanner.close();
    }
}
