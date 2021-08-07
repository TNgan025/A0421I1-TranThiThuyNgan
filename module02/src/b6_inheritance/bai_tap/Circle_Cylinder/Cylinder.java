package b6_inheritance.bai_tap.Circle_Cylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    ;

    public String toString() {
        return "A Cylinder with radius: " + getRadius() + " has color: " + getColor() + " and Volume: " + getVolume();
    }
}
