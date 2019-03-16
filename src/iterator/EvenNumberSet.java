package iterator;

public class EvenNumberSet implements Aggregate<Integer> {
    private final int max;

    public EvenNumberSet(int max) {
        this.max = max;
    }

    public Integer get(int count) {
        if (count * 2 <= max) {
            return count*2;
        } else {
            return null;
        }
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new EvenNumberSetIterator(this);
    }
}
