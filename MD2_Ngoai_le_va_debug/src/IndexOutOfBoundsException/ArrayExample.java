package IndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("List random 0 - 100:");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
