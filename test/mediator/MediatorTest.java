package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {
    @Test
    public void mediatorTest() {
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();

        ControlCenter controlCenter = new ConcreteControlCenter(plane, helicopter);

        plane.takeOff();
        helicopter.hover();

        assertEquals(false, plane.isAirborne());

        plane.takeOff();
        assertEquals(false, helicopter.isAirborne());
    }
}