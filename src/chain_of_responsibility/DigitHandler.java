package chain_of_responsibility;

public class DigitHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String query) throws Exception{
        if (query.matches(".*\\d.*")) {
            throw new Exception("Contains digits");
        }
        next.handle(query);
    }
}
