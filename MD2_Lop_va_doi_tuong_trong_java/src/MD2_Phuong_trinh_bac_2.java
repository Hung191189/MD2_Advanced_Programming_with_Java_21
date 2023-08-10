import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MD2_Phuong_trinh_bac_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a, b, c :");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.getRoot();
    }
    public static class QuadraticEquation{
        double a, b, c;
        public QuadraticEquation(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getQuadraticEquation (){
            double delta;
            return delta = (Math.pow(b,2) - 4*a*c);
        }
        public void getRoot(){
            if(getQuadraticEquation() > 0){
                double x1 = (-b + Math.pow((Math.pow(b,2) - 4*a*c),0.5))/2*a;
                double x2 = (-b - Math.pow((Math.pow(b,2) - 4*a*c),0.5))/2*a;
                System.out.println("PT co nghiem" + x1+ " "+ x2);
            } else if(getQuadraticEquation() == 0){
                double x1 = -b/2*a;
                System.out.println("PT co nghiem: " + x1);
            } else{
                System.out.println("The equation has no roots");
            }
        }
    }
}
