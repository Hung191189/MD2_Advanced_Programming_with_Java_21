package fan;

public class classFan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    int speed = slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public classFan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString(){
        if(isOn()){
            return ("Speed la: " + getSpeed() + "mau cua quat la: " + getColor() + "R cua quat la:  " + getRadius() + "fan is on");
        }else {
            return ("Mau cua quat la: " + getColor() + "R cua quat la: " + getRadius() + "fan is off");
        }
    }
}
