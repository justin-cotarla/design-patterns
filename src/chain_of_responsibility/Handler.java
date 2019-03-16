package chain_of_responsibility;

public interface Handler {
    public void setNext(Handler next);

    public void handle(String query) throws Exception;

}
