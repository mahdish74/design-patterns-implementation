package iterator.container;

import iterator.iterator.Iterator;

public class MList<T> implements Iterable {
    public Object[] array;
    private int index = 0;
    private int size = 0;

    public MList() {
        array = new Object[2];
    }

    private void reconstruct(Object[] array) {
        Object[] temp = new Object[array.length + size];
        for (int t = 0; t < array.length; t++) {
            temp[t] = array[t];
        }
        this.array = temp;
    }

    public void add(T t) {
        if (size >= array.length) {
            reconstruct(array);
        }
        array[size] = t;

        size++;
    }

    public T get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException();
        }
        return (T) array[index];
    }

    public Integer getSize() {
        return Integer.valueOf(size);
    }

    @Override
    public Iterator getIterator() {
        return new MListIterator();
    }

    public class MListIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                T result = (T) array[index];
                index++;
                return result;
            }
            return null;
        }
    }
}
