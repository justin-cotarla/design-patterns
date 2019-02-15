package factory_method;

public class TextReport implements Report {
    String report;

    @Override
    public void generate(String data) {
        report = data + ".txt";
    }

    @Override
    public void display() {
        System.out.println(report);
    }
}