package decorator;

public class UppercasePrinter extends PrinterDecorator {
    public UppercasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String print(String text) {
        return super.print(text.toUpperCase());
    }
}
