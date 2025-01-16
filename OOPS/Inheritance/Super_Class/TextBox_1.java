
public class TextBox_1 extends UIControl {
    private String text = "";

    public TextBox_1() {
        // constructor dont know what to do with the parameter
        // so we use super class and it needs to be the very first statement
        // ->     it will call the constructor of the base class i.e UIControl
//        super(true);
        System.out.println("TextBox");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

}
