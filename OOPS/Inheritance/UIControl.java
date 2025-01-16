
public class UIControl extends Object {
    private boolean isEnabled;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return isEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
