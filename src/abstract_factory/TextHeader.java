package abstract_factory;

public class TextHeader implements ReportHeader {
    @Override
    public void printContent() {
        System.out.println("Text Header");
    }
}
