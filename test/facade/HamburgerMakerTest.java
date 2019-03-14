package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    @Test
    public void facadeTest() {
        HamburgerMaker hamburgerMaker = new HamburgerMaker();

        assertEquals("bun meat ketchup bun", hamburgerMaker.makeBurger());
    }

}