package arraylist;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected static int size = 0;

    protected MyAbstractList() {

    }

    protected MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }

    /** Add a new element at the specified index */
    public abstract void add(int index, String e);

    /** Return true if this list contains the element */
    public abstract boolean contains(String e);

    /** Return the index of the first matching element 66 * in this list. Return -1 if no match. */
    public abstract int indexOf(String e);

    /** Return the index of the last matching element 75 * in this list. Return -1 if no match. */
    public abstract int lastIndexOf(String e);

    /** Replace the element at the specified position
     *  in this list with the specified element. */
    public abstract String set(int index, String e);
}
