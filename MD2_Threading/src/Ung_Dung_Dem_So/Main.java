package Ung_Dung_Dem_So;

public class Main {
    public static void main(String[] args) {
        CountNumber countNumber = new CountNumber();
        try {
            while (countNumber.getMyThread().isAlive()){
                System.out.println("Alive" );
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
}
