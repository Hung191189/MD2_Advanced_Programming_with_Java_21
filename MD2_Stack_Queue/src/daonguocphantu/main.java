package daonguocphantu;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        myStackInteger();
    }
    public static void myStackInteger(){
        int [] arr = {1,2,3,4,5};
        MyStack<Integer> stackInteger = new MyStack<>();
        for (int i = 0; i < arr.length; i++) {
            stackInteger.push(arr[i]);
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = stackInteger.pop();
        }
        System.out.println(Arrays.toString(arr1));
    }
}
