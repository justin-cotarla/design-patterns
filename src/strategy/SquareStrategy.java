package strategy;

public class SquareStrategy implements MathStrategy {
    @Override
    public int alterNumber(int number) {
        return (int) Math.pow(number, 2);
    }
}
