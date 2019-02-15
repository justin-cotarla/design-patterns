package prototype;

public class Driver {
    public static void main(String[] args) {
        Car prototype = new Car(10);

        System.out.println(prototype);

        Car copy = (Car) prototype.clone();

        System.out.println(copy);
    }
}
