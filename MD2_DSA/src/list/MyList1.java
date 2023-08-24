package list;

import java.util.Arrays;

public class MyList1<E> {
    public int size;
    public int DEFAULT_CAPACITY = 10;

    public Object [] element;
    public MyList1(){
    element = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCap(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if(size == element.length) {
            ensureCap();
        }
        element[size++] = e;
    }
    public E get(int i){
        if(i> size || size < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }


}
