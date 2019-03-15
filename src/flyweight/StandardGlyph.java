package flyweight;

public class StandardGlyph implements Glyph {
    private final String lowerCase;
    private final String upperCase;

    public StandardGlyph(String lowerCase, String upperCase) {
        this.lowerCase = lowerCase;
        this.upperCase = upperCase;
    }

    @Override
    public String display(String tag) {
        return "<" + tag + ">" + lowerCase + " " + upperCase + "<" + tag + ">";
    }
}
