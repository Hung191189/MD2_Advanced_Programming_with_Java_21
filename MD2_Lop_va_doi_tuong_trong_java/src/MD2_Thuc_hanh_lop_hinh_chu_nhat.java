import java.util.Scanner;

public class MD2_Thuc_hanh_lop_hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("\nYour rectangle: " + rectangle.Display());
        System.out.println("Your rectangle area: " + rectangle.Area());
        System.out.println("Your rectangle perimeter: " + rectangle.Perimeter());
    }
    public static class Rectangle{
        double width, height;
        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        public double Area(){
            return this.width * this.height;
        }
        public double Perimeter(){
            return (this.width + this.height)*2;
        }
        public String Display(){
            return "Rectangle{"+ "width = " + width + "height = " + height + "}";
        }
    }
}

