package proxy;

public class ConcreteResource implements Resource {

    @Override
    public String getResource() {
        return "Hello World";
    }
}
