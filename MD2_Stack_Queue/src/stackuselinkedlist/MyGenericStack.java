package stackuselinkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<S> {
    private LinkedList<S> stack;
    public MyGenericStack(){
        stack = new LinkedList<S>();
    }
    public LinkedList<S> getStack(){
        return stack;
    }
    public void push(S ele){
        stack.add(ele);
    }
    public S pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
