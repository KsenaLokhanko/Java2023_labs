import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Class ToysCollection creates a collection of toys.
 * ToysCollection implements interface Set
 *
 * @author Kseniia Lokhanko
 * @version 1.0 21.12.2023
 */
public class ToysCollection<T> implements Set<Toy> {

    private int size;
    private final double increasePercent = 1.3;
    private Object[] elements = new Object[15];

    /**
     * Constructor of an empty collection
     */
    public ToysCollection() {
        size = 0;
    }

    /**
     * Constructor of a collection with one element
     */
    public ToysCollection(Toy o) {
        size = 1;
        elements[0] = o;
    }

    /**
     * Constructor of a collection that includes elements
     * of ToysCollection collection
     */
    public ToysCollection(Collection<? extends Toy> o) {
        size = 0;
        addAll(o);
    }

    /**
     * Private method, which increases size of elements
     * of collection array
     *
     * @return void
     */
    private void increaseSize() {
        Object[] temporary = elements;
        elements = new Object[(int) (elements.length * increasePercent)];
        size = 0;
        for (Object t : temporary) {
            add((Toy) t);
        }
    }

    /**
     * Overridden standard methods of Set collection
     * <p>
     * Method that clears this collection from its elements
     *
     * @return void
     */
    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Method that returns number of elements in collection
     *
     * @return size of collection
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Method that checks out is the collection empty
     *
     * @return true if collection is empty, else false
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Method that checks out does the collection contain defined element
     *
     * @return true if collection contains the element, else false
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method that checks out does the collection contain
     * all elements of given collection
     *
     * @return true if collection contains the elements, else false
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        MyIterator iterator = (MyIterator) c.iterator();
        while (iterator.hasNext()) {
            if (!contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method that transmits collection into array
     *
     * @return array
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    /**
     * Method that transmits collection into defined type array
     *
     * @return array
     */
    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size) {
            return (E[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    /**
     * Method that adds an element into collection
     *
     * @return true
     */
    @Override
    public boolean add(Toy e) {
        if (!contains(e)) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    size++;
                    elements[i] = e;
                    return true;
                }
            }
            increaseSize();
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    size++;
                    elements[i] = e;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Private method that returns last not null element
     * of data structure of collection
     *
     * @return int index of last not null element
     */
    private int lastNotEmpty() {
        int i = elements.length - 1;
        while (elements[i] == null) {
            i--;
        }
        return i + 1;
    }

    /**
     * Method that removes element from collection
     *
     * @return true if the element was removed, else false
     */
    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                size--;
                elements[i] = elements[lastNotEmpty()];
                elements[lastNotEmpty()] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Method that adds all the elements from the given collection
     *
     * @return true
     */
    @Override
    public boolean addAll(Collection<? extends Toy> c) {
        MyIterator iterator = (MyIterator) c.iterator();
        while (iterator.hasNext()) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    add((Toy) iterator.next());
                }
            }
            increaseSize();
        }
        return true;
    }

    /**
     * Method that removes all the elements not belonging
     * to given collection
     *
     * @return true if any elements were removed, else false
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean flag = false;
        for (Object i : elements) {
            if (!c.contains(i)) {
                flag |= remove(i);
            }
        }
        return flag;
    }

    /**
     * Method that removes all the elements belonging
     * to given collection
     *
     * @return true if any elements were removed, else false
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = false;
        for (Object o : c) {
            flag |= remove(o);
        }
        return flag;
    }

    /**
     * Method that returns iterator of the collection
     *
     * @return iterator of collection
     */
    @Override
    public Iterator<Toy> iterator() {
        return new MyIterator();
    }

    /**
     * Defining an iterator to the collection
     */
    private class MyIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < lastNotEmpty();
        }

        @Override
        public Object next() {
            while (hasNext()) {
                if (elements[index] == null) {
                    index++;
                } else {
                    return elements[index++];
                }
            }
            return null;
        }
    }
}
