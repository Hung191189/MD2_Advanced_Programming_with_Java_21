package RacingCar;
import java.util.Random;
import static RacingCar.Main.FINISH;
import static RacingCar.Main.STEP;

public class Cars implements Runnable{
    private String name;
    public Cars(String name){
        this.name = name;
    }

    @Override
    public void run() {
        int start = 0;
        long startTime = System.currentTimeMillis();
        while (start < FINISH){
            try {
                int speed = (new Random()).nextInt(20);
                start += speed;
                String log = "|";
                int percentRace = (start*100)/ FINISH;
                for (int i = 0; i < FINISH; i+= STEP) {
                    if(percentRace >= i + STEP){
                        log += "=";
                    } else if (percentRace >= i && percentRace < i + STEP) {
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ":" + log + " " + Math.min(FINISH, start) + "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car" + this.name + "broken...");
                break;
            }
        }
        long endTime =System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in " + (endTime - startTime)/1000 + "s");
    }
}
