package strategy;

public class TripleStrategy implements MathStrategy {
    @Override
    public int alterNumber(int number) {
        return number * 3;
    }
}
