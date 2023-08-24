package daonguocphantu;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<S> {
    private LinkedList<S> stack;
    public MyStack(){
        stack = new LinkedList<S>();
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
}
