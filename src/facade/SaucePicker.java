package facade;

public class SaucePicker {
    private final String sauce;

    public SaucePicker(String sauce) {
        this.sauce = sauce;
    }

    public String pickSauce() {
        return sauce;
    }
}
