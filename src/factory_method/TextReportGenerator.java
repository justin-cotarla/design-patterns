package factory_method;

public class TextReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new TextReport();
    }
}