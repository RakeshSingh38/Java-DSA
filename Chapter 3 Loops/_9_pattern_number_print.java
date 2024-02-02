public class _9_pattern_number_print {
    public static void main(String[] args) {
        int count = 4;
        int number=1;
        for(int i=1;i<=count;i++){
            for(number=1;number<=i;number++){
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
