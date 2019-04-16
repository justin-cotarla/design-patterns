package mediator;

public interface ControlCenter {
    public void notify(Aircraft component, boolean state);
}
