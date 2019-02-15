package abstract_factory;

public class PdfReportFactory implements ReportFactory {

    @Override
    public ReportHeader generateHeader() {
        return new PdfHeader();
    }

    @Override
    public ReportFooter generateFooter() {
        return new PdfFooter();
    }
}
