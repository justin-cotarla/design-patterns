package facade;

public class BreadPicker {
    private final String bread;

    public BreadPicker(String bread) {
        this.bread = bread;
    }

    public String pickBread() {
        return bread;
    }
}
