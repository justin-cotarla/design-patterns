package builder;

public class PdfReportBodyBuilder implements ReportBodyBuilder {
    private ReportBody reportBody;

    public PdfReportBodyBuilder() {
        reportBody = new PdfReportBody();
    }

    @Override
    public ReportBodyBuilder setName(String name) {
        reportBody.setName(name);
        return this;
    }

    @Override
    public ReportBody build() {
        ReportBody reportBody = new PdfReportBody();
        reportBody.setName(this.reportBody.getName());
        return reportBody;
    }
}
