package abstract_factory;

public class TextFooter implements ReportFooter {
    @Override
    public String getContent() {
        return "Text Footer";
    }
}
