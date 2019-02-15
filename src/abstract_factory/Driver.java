package abstract_factory;

public class Driver {
    public static void main(String[] args) {
        ReportFactory factory = new PdfReportFactory();

        ReportFooter footer = factory.generateFooter();
        ReportHeader header = factory.generateHeader();

        header.printContent();
        footer.printContent();
    }
}
