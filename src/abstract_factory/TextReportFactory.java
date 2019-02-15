package abstract_factory;

public class TextReportFactory implements ReportFactory {
    @Override
    public ReportHeader generateHeader() {
        return new TextHeader();
    }

    @Override
    public ReportFooter generateFooter() {
        return new TextFooter();
    }
}
