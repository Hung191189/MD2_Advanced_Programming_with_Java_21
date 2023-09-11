package DemoRegex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        boolean isValidate;
        do {
            System.out.println("Enter string: ");
            String input = scanner.nextLine();
            isValidate = regex.validate(input);
            System.out.println(input + " " + isValidate);
        }while (!isValidate);
    }
}
