package stackuselinkedlist;

import java.util.LinkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("\n1. Stack of Strings");
        stackOfStrings();
        System.out.println("\n2. Stack of decimal");
        stackOfInteger();
    }
    public static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<String>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println("1. Size of stack after push: " + stack.size());
        System.out.println(stack.getStack());
        System.out.println("2. Pop element form stack: ");
       while(stack.size() !=0){
           stack.pop();
           System.out.println(stack.getStack() + " \n");
       }
        System.out.println("\n3. Size of stack after pop: " + stack.size());
    }
    public static  void stackOfInteger() {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
//        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\nstack size after pop: " + stack.size());
    }
}
