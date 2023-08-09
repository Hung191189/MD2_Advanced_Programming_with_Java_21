import java.util.Date;
import java.util.Locale;

public class demo {

    public static void main(String[] args) {
        int x = 666;
        double y = 33.59;
        System.out.printf("%d\n%.1f", x, y);
        System.out.println("\nsum of 1 -10 = " + sum(1,10));
    }
    public static int sum(int x1, int x2) {
        int result = 0;
        for (int i = x1; i < x2; i++) {
            result += i;
        }
        return result;
    }
}

