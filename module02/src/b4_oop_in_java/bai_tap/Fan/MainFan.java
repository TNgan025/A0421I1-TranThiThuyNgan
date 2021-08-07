package b4_oop_in_java.bai_tap;

public class MainFan {
    public static void main(String[] args) {
 Fan fan1 = new Fan();
 fan1.setSpeed(3);
 fan1.setRadius(10);
 fan1.setColor("yellow");
 fan1.setOn(true);
        System.out.println("Status of Fan 1: "+fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Status of Fan 2: "+fan2.toString());
    }

}
