package bridge;

public class Driver {
    public static void main(String[] args) {
        Shape t = new Triangle(new Blue());
        Shape s = new Square(new Blue());

        System.out.println(t.display());
        System.out.println(s.display());

        s.setColor(new Red());
        System.out.println(s.display());
    }
}
