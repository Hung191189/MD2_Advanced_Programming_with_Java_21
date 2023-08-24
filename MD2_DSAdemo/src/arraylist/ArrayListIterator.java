package arraylist;

import java.util.Iterator;



public class ArrayListIterator  implements Iterator {
    private int current = 0;

    @Override
    public boolean hasNext() {
        return (current < MyAbstractList.size);
    }

    @Override
    public String[] next() {
        return new String[]{MyArrayList.data[current++]};
    }

    @Override
    public void remove() {
        String remove = MyArrayList.this.remove(current);
    }
}

