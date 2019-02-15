package abstract_factory;

public class PdfHeader implements ReportHeader {
    @Override
    public void printContent() {
        System.out.println("PDF Header");
    }
}
