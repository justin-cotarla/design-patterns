package bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String display() {
        return "Sides: 4, Hex: " + color.getHex();
    }
}
