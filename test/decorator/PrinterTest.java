package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    public void DecoratorTest() {
        Printer concretePrinter = new ConcretePrinter();
        Printer uppercasePrinter = new UppercasePrinter(concretePrinter);

        assertEquals("hello world", concretePrinter.print("hello world"));
        assertEquals("HELLO WORLD", uppercasePrinter.print("hello world"));
    }
}