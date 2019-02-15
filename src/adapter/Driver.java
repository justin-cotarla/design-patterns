package adapter;

public class Driver {
    public static void main(String[] args) {
        Person person = new FrenchPersonAdapter();

        person.speak();
    }
}
