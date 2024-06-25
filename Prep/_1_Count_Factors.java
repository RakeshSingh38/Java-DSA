//import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class _1_Count_Factors {
    public static void main(String[] args) {
        System.out.println();
        int n = 37;
        System.out.print(n + " is ");
        //System.out.println(isPrime(n));
        //System.out.println(36%6==0);
        isPrime(n);
        System.out.print("\nTotal Factors count of " + n + " is");
        //System.out.print(" -> " + countFactors(36));

        //int ans  = countFactors(24);
        //System.out.println("\nCount =  " + ans);
        System.out.println("\n");
        //System.out.println(countFactorsWithoutRoot(1000000000));

        /*{
            String s = 3 > 2 ? ("Hello") : ("Bye");
            System.out.println(s);
        }*/
        //String s = "Rakes";
        //System.out.println(s);

        List<Integer> list = printDivisors(10);
        System.out.println(list);
    }

    static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n;) {
            if (n % i == 0) {
                if (i != n / i) {
                    count += 2;
                } else {
                    count++;
                }
            }
            //System.out.println(prime+" ");
            i++;
        }
        return count;
    }

    public static List<Integer> printDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    static int countFactorsWithoutRoot(int n) {
        int count = 0;
        for (int i = 1; i <= n;) {
            if (n % i == 0) {

                if (i != n / i) {
                    count++;
                }
                //System.out.println(prime+" ");
            }
            //System.out.println(prime+" ");
            i++;
        }
        return count;
    }

    static void isPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n;) {
            if (n % i == 0) {

                if (i != n / i) {
                    count += 2;
                } else {
                    count++;
                }
                //System.out.println(prime+" ");
            }
            //System.out.println(prime+" ");
            i++;
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
