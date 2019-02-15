package factory_method;

public class PdfReport implements Report {
    String report;

    @Override
    public void generate(String data) {
        report = data + ".pdf";
    }

    @Override
    public void display() {
        System.out.println(report);
    }
}
