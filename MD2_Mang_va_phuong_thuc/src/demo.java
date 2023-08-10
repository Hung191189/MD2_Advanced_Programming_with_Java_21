import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class demo {

    public static void main(String[] args) {
//        int x = 666;
//        double y = 33.59;
//        System.out.printf("%d\n%.1f", x, y);
//        System.out.println("\nsum of 1 -10 = " + sum(1,10));
//    }
//    public static int sum(int x1, int x2) {
//        int result = 0;
//        for (int i = x1; i < x2; i++) {
//            result += i;
//        }
//        return result;
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

