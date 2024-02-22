
public class _1_Count_Factors {
    public static void main(String[] args) {
        System.out.println();
        int n = 24;
        System.out.print(n + " is ");
        //System.out.println(isPrime(n));
        isPrime(n);
        System.out.print("\nTotal Factors count of " + n + " is");
        System.out.print(" -> " + countFactors(24));

        //int ans  = countFactors(24);
        //System.out.println("\nCount =  " + ans);
        System.out.println("\n");
        //System.out.println(countFactorsWithoutRoot(1000000000));
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
