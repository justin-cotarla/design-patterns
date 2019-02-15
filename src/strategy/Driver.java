package strategy;

public class Driver {
    public static void main(String[] args) {
        int number = 10;
        
        NumberCruncher cruncher = new NumberCruncher(new TripleStrategy());

        cruncher.crunch(number);

        cruncher.setStrategy(new SquareStrategy());

        cruncher.crunch(number);
    }
}
