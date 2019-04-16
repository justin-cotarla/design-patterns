package mediator;

public class Plane extends Aircraft {
    public void takeOff() {
        setAirborne(true);
    }

    public void touchDown() {
        setAirborne(false);
    }
}
