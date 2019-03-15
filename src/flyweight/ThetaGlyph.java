package flyweight;

public class ThetaGlyph implements Glyph {
    private final String representation = "Θ";

    @Override
    public String display(String tag) {
        return "<" + tag + ">" + representation + "<" + tag + ">";
    }
}
