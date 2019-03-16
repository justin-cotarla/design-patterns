package iterator;

public interface Aggregate<T> {
    public Iterator<T> createIterator();
}
