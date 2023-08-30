package RacingCar;

public class Main {
    public static int FINISH = 100;
    public static int STEP = 5;
    public static void main(String[] args) {
        Cars cars1 = new Cars("Car1");
        Cars cars2 = new Cars("Car2");
        Cars cars3 = new Cars("Car3");
        Thread thread1 = new Thread(cars1);
        Thread thread2 = new Thread(cars2);
        Thread thread3 = new Thread(cars3);
        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
