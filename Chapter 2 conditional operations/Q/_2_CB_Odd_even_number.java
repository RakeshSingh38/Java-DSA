//package Q;

public class _2_CB_Odd_even_number {

    public static void main(String[] args) {
        /* 
        We start by declaring and initializing two integer variables: n and lastDigit. n represents the given number, and lastDigit will store the last digit of n in each iteration.
        
        The while loop is used to iterate through each digit of the number. The loop continues as long as n is greater than 0.
        
        Inside the loop, we use the modulo operator (%) to extract the last digit of n and store it in the lastDigit variable. For example, if n is 3467, the first iteration will set lastDigit to 7.
        
        We then check if the lastDigit is even by using the modulo operator again. If lastDigit % 2 equals 0, it means the digit is even.
        
        If the digit is even, we print it using the System.out.println statement.
        
        Finally, we update the value of n by dividing it by 10. This removes the last digit from n and prepares it for the next iteration. For example, if n is 3467, after the first iteration, n will become 346.
        
        The loop continues until all the digits of n have been processed
        
         */
        int n = 3467;
        int lastDigit;

        while (n > 0) {
            lastDigit = n % 10;
            if (lastDigit % 2 == 0) {

                System.out.println(lastDigit);
            }

            n = n / 10;

        }
    }
}
