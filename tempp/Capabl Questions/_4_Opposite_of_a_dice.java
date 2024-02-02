import java.util.Scanner;

public class _4_Opposite_of_a_dice {
    static int oppositeFace(int faceNumber) {
        // imp      formula for opposite face of a dice is 7 - faceNumber
        return 7 - faceNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFace = scanner.nextInt();
        int result = oppositeFace(inputFace);
        System.out.println(result);
        scanner.close();
    }
}
