package Ten_Cua_Lop_Hoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateClassName validateClassName = new ValidateClassName();
        boolean isValidate;
        do {
            System.out.println("Enter class name: ");
            String input = scanner.nextLine();
            isValidate = validateClassName.validate(input);
            System.out.println(input + " " + isValidate);
        }while (!isValidate);
    }
}
