package chain_of_responsibility;

public class SpaceHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String query) throws Exception{
        if (query.contains(" ")) {
            throw new Exception("Contains space");
        }
        next.handle(query);
    }
}
