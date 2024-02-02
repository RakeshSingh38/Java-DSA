import java.util.Scanner;

public class _1_If_Else {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int age = sc.nextInt();

            if(age>=18){
                System.out.println("You can drive as u are adult");
            }
            if(age>13  && age<18){
                System.out.println("Teenager");
            }
            else{
                System.out.println("You can't Drive");
            }
        }
        
    }
}
