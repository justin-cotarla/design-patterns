package abstract_factory;

public class TextHeader implements ReportHeader {
    @Override
    public String getContent() {
        return "Text Header";
    }
}
