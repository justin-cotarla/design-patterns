package iterator;

public class EvenNumberSetIterator implements Iterator<Integer> {
    private final EvenNumberSet evenNumberSet;
    private int count = 0;

    public EvenNumberSetIterator(EvenNumberSet evenNumberSet) {
        this.evenNumberSet = evenNumberSet;
    }

    @Override
    public boolean hasNext() {
        return evenNumberSet.get(count) != null;
    }

    @Override
    public Integer next() {
        return evenNumberSet.get(count++);
    }
}
