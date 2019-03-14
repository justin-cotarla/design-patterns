package bridge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String display() {
        return "Sides: 3, Hex: " + color.getHex();
    }
}
