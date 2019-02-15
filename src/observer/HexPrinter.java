package observer;

public class HexPrinter implements Observer {
    NumberFeed feed;

    public HexPrinter(NumberFeed feed) {
        this.feed = feed;
        feed.attach(this);
    }

    @Override
    public void update() {
        int currentNumber = feed.getState();
        System.out.println(Integer.toHexString(currentNumber));
    }
}
