package abstract_factory;

public interface ReportFactory {
    public ReportHeader generateHeader();

    public ReportFooter generateFooter();
}
