
public class UIControl_2 {
    // protected means that this field is accessible in this class and any subclass but only inside the package
    //private boolean isEnabled;
    protected boolean isEnabled;

    // adding a parameter to the constructor to see the super keyword in action
    public UIControl_2(boolean isEnabled) {
        //  this keyword refers to the current object in a method or constructor.
        this.isEnabled = isEnabled;
        System.out.println("UIControl");

    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
