package proxy;

public class Driver {
    public static void main(String[] args) {
        Resource r = new ProtectedResource();

        System.out.println(r.getResource());

        ((ProtectedResource) r).authenticate("qwerty");

        System.out.println(r.getResource());
    }
}
