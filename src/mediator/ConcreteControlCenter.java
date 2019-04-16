package mediator;

public class ConcreteControlCenter implements ControlCenter {
    private Plane plane;
    private Helicopter helicopter;

    public ConcreteControlCenter(Plane plane, Helicopter helicopter) {
        this.plane = plane;
        this.helicopter = helicopter;

        plane.setMediator(this);
        helicopter.setMediator(this);
    }

    @Override
    public void notify(Aircraft component, boolean state) {
        if (component == plane && helicopter.isAirborne()) {
            helicopter.land();
        }

        if (component == helicopter && plane.isAirborne()) {
            plane.touchDown();
        }
    }
}
