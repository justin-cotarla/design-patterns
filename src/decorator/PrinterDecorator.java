package decorator;

public abstract class PrinterDecorator implements Printer {
    protected final Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print(String text) {
        return printer.print(text);
    }
}
