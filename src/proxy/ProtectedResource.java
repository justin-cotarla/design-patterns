package proxy;

public class ProtectedResource implements Resource {
    private boolean authenticated = false;

    public void authenticate(String password) {
        authenticated = (password == "qwerty");
    }

    @Override
    public String getResource() {
        if (authenticated) {
            return new ConcreteResource().getResource();
        } else {
            return "Not authenticated";
        }
    }
}
