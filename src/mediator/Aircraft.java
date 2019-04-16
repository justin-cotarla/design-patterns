package mediator;

public abstract class Aircraft {
    private ControlCenter mediator;
    private boolean isAirborne;

    public void setMediator(ControlCenter mediator) {
        this.mediator = mediator;
    }

    public boolean isAirborne() {
        return isAirborne;
    }

    protected void setAirborne(boolean airborne) {
        isAirborne = airborne;
        mediator.notify(this, airborne);
    }
}
