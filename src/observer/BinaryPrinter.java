package observer;

public class BinaryPrinter implements Observer {
    private NumberFeed feed;

    public BinaryPrinter(NumberFeed feed) {
        this.feed = feed;
        feed.attach(this);
    }

    @Override
    public void update() {
        int currentNumber = feed.getState();
        System.out.println(Integer.toBinaryString(currentNumber));
    }
}
