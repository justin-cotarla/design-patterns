package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    public void iteratorTest() {
        Aggregate<Integer> evenNumberSet = new EvenNumberSet(2);
        Iterator<Integer> iterator = evenNumberSet.createIterator();

        assertEquals(true, iterator.hasNext());

        assertEquals(0, iterator.next());

        assertEquals(true, iterator.hasNext());

        assertEquals(2, iterator.next());

        assertEquals(false, iterator.hasNext());


    }

}