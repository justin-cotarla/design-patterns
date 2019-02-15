package abstract_factory;

public class PdfFooter implements ReportFooter {
    @Override
    public void printContent() {
        System.out.println("PDF Footer");
    }
}
