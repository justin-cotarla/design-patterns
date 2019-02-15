package adapter;

public class FrenchPersonAdapter extends FrenchPerson implements Person {
    @Override
    public void speak() {
        parle();
    }
}
