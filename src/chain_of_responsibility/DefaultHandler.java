package chain_of_responsibility;

public class DefaultHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String query) throws Exception{
        // Good
    }
}
