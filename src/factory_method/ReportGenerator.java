package factory_method;

public abstract class ReportGenerator {
    public Report generateReport(String data) {
        Report report = instantiateReport();
        report.generate(data);
        return report;
    }

    protected abstract Report instantiateReport();
}
