
/**
 * This class represents a program that prints the lyrics of the "Ten Green Bottles" song.
 * It counts down from a specified number of bottles and displays the lyrics for each bottle.
 */
public class _1_bottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
                    System.out.println();

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end cla
