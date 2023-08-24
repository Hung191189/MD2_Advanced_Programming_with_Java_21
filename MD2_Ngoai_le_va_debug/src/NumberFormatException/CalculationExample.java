package NumberFormatException;

public class CalculationExample {
    public void calculation(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println(" " + a);
            System.out.println(" " + b);
            System.out.println(" " + c);
            System.out.println(" " + d);

        }catch (Exception e){
            System.out.println(" " + e.getMessage());

        }
    }
}
