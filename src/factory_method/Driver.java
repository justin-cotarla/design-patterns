package factory_method;

public class Driver {
    public static void main(String[] args) {
        ReportGenerator pdfReportGenerator = new PdfReportGenerator();

        Report report = pdfReportGenerator.generateReport("test");

        report.display();
    }
}
