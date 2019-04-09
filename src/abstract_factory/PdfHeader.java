package abstract_factory;

public class PdfHeader implements ReportHeader {
    @Override
    public String getContent() {
        return "PDF Header";
    }
}
