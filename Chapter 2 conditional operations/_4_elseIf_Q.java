import java.util.Scanner;

public class _4_elseIf_Q {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int income = sc.nextInt();
            if(income<500000){
                System.out.println("Income is less than 5 lakh");
            }
            else if(income>=500000&&income<=1000000){
                System.out.println("Income is between 5 and 10 lakh");
            }
            else{
                System.out.println("income is greater than 10 lakh");
            }
        }
        
    }
}
