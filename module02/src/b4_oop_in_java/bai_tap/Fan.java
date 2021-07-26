package b4_oop_in_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean On = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
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

    public Fan() {
        this.On = On;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    //Phương thức toString() trả về chuỗi chứa thông tin của quạt.
    // Nếu quạt đang ở trạng thái on, phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    // Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.
    public String toString() {
        if (On) {
            return speed + " , " + color + " , " + radius + " , fan is on";
        } else {
            return color + " , " + radius + " , fan is off";
        }
    }
}
