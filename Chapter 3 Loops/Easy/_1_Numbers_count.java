public class _1_Numbers_count {
    public static void main(String[] args) {

        //  To count the numbers between any range  we do ( return end - start + 1 )
        // imp           b  - a + 1
        // we can do 10 - 3 + 1 = 8
        System.out.println("To count the numbers between any range  we do ( return end - start + 1 )");
        System.out.println(counts(3, 10));

        System.out.println("\nUsing for Loop to count the numbers usig count variable");
        int number = count(3, 10);
        System.out.println(number);
        //int num = 123;
        System.out.println("\nUsing log10 to count the number of digits in a number");
        System.out.println(count2(30));

        System.out.println("\nIf both a and b are exclusive then return end - start - 1");
        // if both  a and b are exclusive 
        System.out.println(countExclusive(3, 10));
    }

    // imp      if start and end are exclusive then return end - start
    static int countExclusive(int start, int end) {
        return end - start - 1;
    }

    static int counts(int start, int end) {
        return end - start + 1;
        // if end is exclusive then return end - start
    }

    static int count(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
        }
        return count;
    }

    static int count2(int n) {
        return (int) (Math.log10(n) + 1);
    }
}
