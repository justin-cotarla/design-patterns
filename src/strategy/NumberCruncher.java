package strategy;

public class NumberCruncher {
    MathStrategy strategy;

    public NumberCruncher(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public void crunch(int number) {
        System.out.println("Crunching: " + number);
        System.out.println("Result: " + strategy.alterNumber(number));
    }
}
