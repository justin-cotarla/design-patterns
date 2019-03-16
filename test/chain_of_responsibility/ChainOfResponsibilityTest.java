package chain_of_responsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityTest() {
        Handler digitHandler = new DigitHandler();
        Handler spaceHandler = new SpaceHandler();
        Handler defaultHandler = new DefaultHandler();

        digitHandler.setNext(spaceHandler);
        spaceHandler.setNext(defaultHandler);

        Exception spaceException = assertThrows(Exception.class, () -> digitHandler.handle("hello world"));
        assertEquals("Contains space", spaceException.getMessage());

        Exception digitException = assertThrows(Exception.class, () -> digitHandler.handle("hello9world"));
        assertEquals("Contains digits", digitException.getMessage());

        assertDoesNotThrow(() -> digitHandler.handle("helloworld"));
    }

}