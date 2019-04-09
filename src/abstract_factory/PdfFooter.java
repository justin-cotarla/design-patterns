package abstract_factory;

public class PdfFooter implements ReportFooter {
    @Override
    public String getContent() {
        return "PDF Footer";
    }
}
