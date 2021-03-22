package iterator.container;

import iterator.iterator.Iterator;
import state.state.C;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class MList  implements Container {
    public String names[] = {"mahdi", "ali", "hasan"};


    @Override
    public Iterator getIterator() {
        return new MListIterator();
    }

    public class MListIterator implements Iterator {
        int index;


        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }
}
