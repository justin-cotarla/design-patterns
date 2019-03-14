package decorator;

public class ConcretePrinter implements Printer {
    @Override
    public String print(String text) {
        return text;
    }
}
