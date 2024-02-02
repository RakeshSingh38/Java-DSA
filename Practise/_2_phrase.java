import java.util.Random;

/**
 * This class generates a random phrase by combining words from three different word lists.
 * The generated phrase is then printed to the console.
 */
/**
 * This class generates a random phrase by combining words from three different word lists.
 */
public class _2_phrase {
    public static void main(String[] args) {

        /**
         * This array contains a list of words used in a phrase.
         */
        String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
                "pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

        String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
                "aligned", "targeted", "shared", "cooperative", "accelerated" };

        String[] wordListThree = { "process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int ThreeLength = wordListThree.length;

        var randomGenerator = new Random();
        int random1 = randomGenerator.nextInt(oneLength);
        int random2 = randomGenerator.nextInt(twoLength);
        int random3 = randomGenerator.nextInt(ThreeLength);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        // it generates a random number between 0 and 15
        Random test = new Random();
        int test2 = test.nextInt(test.nextInt(15));

        System.out.println(test2);
        System.out.println(phrase);
    }
}
