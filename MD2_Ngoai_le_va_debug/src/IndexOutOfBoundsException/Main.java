package IndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        System.out.println("\nEnter x: 0 =< x < 100");
        int num = scanner.nextInt();
        try {
            System.out.println("Value index of x :" + num + " is " + arr[num] );
        } catch (IndexOutOfBoundsException e){
            System.out.println("Value exceeds ");
        }

    }

}
