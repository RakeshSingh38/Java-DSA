public class TextBox extends UIControl {

    //public TextBox(boolean isEnabled) {
    //    super(isEnabled);
    //}

    private String text = "";

    // Method overriding :  if the same method is defined in both the superclass and the subclass, 
    //then the method of the subclass class overrides the method of the superclass. 
    //This is known as method overriding.
    // we use @Override annotation to show that we are overriding the method of the superclass
    @Override
    public String toString() {
        return "I am a TextBox";
    }
// -------------------------------------------------------------------------------------------------------------------

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
