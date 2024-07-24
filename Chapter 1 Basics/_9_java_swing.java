import static javax.swing.JOptionPane.*;

public class _9_java_swing {
    public static void main(String[] args) {

        // fix      to avoid writing JOptionPane everytime make it static
        String name = showInputDialog("Enter your Name");
        int age = Integer.parseInt(showInputDialog("Enter your age"));
        String height = (showInputDialog("Enter your Height in cm"));
        //showMessageDialog(null, "hello " + name);

        // r        getting all data at once
        showMessageDialog(null,
                "Hello u are " + name + "\nYou are " + age + " years old\nYour height is " + height + " cm");
        // ->                                          ↑     ↑
        // there are 2 plus signs so be careful

        //showMessageDialog(null, "You are " + height + " cm tall");
        showMessageDialog(null, "Thans for Executing the Program \n Have a good day");

    }
}
