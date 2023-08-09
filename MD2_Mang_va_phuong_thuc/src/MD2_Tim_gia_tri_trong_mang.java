import java.util.Scanner;

public class MD2_Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"duong", "nam", "dat", "kien"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Ten no co trong danh sach: " + input + " o vi tri: " + i);
                check = true;
                break;
            }

        }
        if (!check) {
            System.out.println("No ko co trong danh sach");
        }
    }
}