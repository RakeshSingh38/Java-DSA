
// imp      it only takes a single value
public class _6_soring_sentence {

    public static void main(String[] args) {
        // Program to find occurrence of a Character
        int n = 5;
        int row = 1;
        int star = row;
        int space = n - 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }
            row++;
            System.out.println("");
            space--;
            star++;
        }
    }
}
// Program to sort a sentence
//String s = "Rakesh Singh";
//String[] words = s.split(" ");
//for (int i = 0; i < words.length; i++) {
//    System.out.println(words[i]);
//}
//System.out.println();
