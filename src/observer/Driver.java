package observer;

public class Driver {
    public static void main(String[] args) {
        NumberFeed feed = new NumberFeed();

        HexPrinter hexPrinter = new HexPrinter(feed);
        BinaryPrinter binPrinter = new BinaryPrinter(feed);

        feed.setState(30);
        feed.setState(44);
    }
}
