package abstract_factory;

public class TextFooter implements ReportFooter {
    @Override
    public void printContent() {
        System.out.println("Text Footer");
    }
}
