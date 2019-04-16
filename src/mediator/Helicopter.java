package mediator;

public class Helicopter extends Aircraft {
    public void hover() {
        setAirborne(true);
    }

    public void land() {
        setAirborne(false);
    }
}
