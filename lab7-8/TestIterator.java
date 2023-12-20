/**
 * Testing my iterator inside ToysCollection
 */

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class TestIterator {

    /**
     * Initializing variables for testing
     */
    Iterator testIterator;
    ToysCollection testCollection;
    private Toy a;
    private Toy b;
    private Toy c;

    /**
     * Initializing variables for testing
     */
    @Before
    public void setUp() throws MyException {
        a = new Toy("Плюшевий ведмідь", 12);
        b = new Toy("Машинка", 8);
        testCollection = new ToysCollection();
        testCollection.add(a);
        testCollection.add(b);
        testIterator = testCollection.iterator();
    }

    /**
     * Testing iterator's method hasNext
     */
    @Test
    public void testHasNext() {
        assertTrue(testIterator.hasNext());
        testIterator.next();
        assertFalse(testIterator.hasNext());
    }

    /**
     * Testing iterator's method Next
     */
    @Test
    public void testNext() {
        assertSame(b, testIterator.next());
    }
}
