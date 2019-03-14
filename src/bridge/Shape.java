package bridge;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String display();
}
