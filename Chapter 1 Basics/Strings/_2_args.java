import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class _2_args {
    // r            to read txt files easily
    public static void main(String[] args)  throws FileNotFoundException{
        //System.out.println(args[1]);

        File file = new File("a.txt");
        Scanner sc = new Scanner (file);

        System.out.println(sc.nextLine());
        sc.close();
    }
}
