package builder;

public class Driver {
    public static void main(String[] args) {
        ReportBodyBuilder reportBodyBuilder = new PdfReportBodyBuilder();

        ReportBody reportBody = reportBodyBuilder.setName("John").build();

        reportBody.printContent();
    }

}
