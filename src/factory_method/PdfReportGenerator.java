package factory_method;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new PdfReport();
    }
}
