package prototype;

public class Car implements Prototype {
    private int wheelNumber;

    public Car(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public Prototype clone() {
        return new Car(wheelNumber);
    }

    @Override
    public String toString() {
        return "Number of wheels: " + wheelNumber;
    }
}
