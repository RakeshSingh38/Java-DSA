import javax.swing.JOptionPane;

public class _9_java_swing {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your Name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");
        // ->                                          ↑     ↑
        // there are 2 plus signs so be careful

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height in cm"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
        JOptionPane.showMessageDialog(null, "Thans for Executing the Program \n Have a good day");

    }
}
