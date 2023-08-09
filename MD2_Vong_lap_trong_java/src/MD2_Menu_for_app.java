import java.util.Scanner;

public class MD2_Menu_for_app {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < 7; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("No choice");
            }
        }
    }
}
