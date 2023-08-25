package IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            if (x < 0 || y < 0 || z < 0) {
                throw new IllegalTriangleException();
            } else if (x + y <= z || x + z <= y || y + z <= x) {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e) {
            System.out.println("sai canh");
        } finally {
            System.out.println("hi anh em");
        }
    }
}

