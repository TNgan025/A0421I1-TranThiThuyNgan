package b5_accessModifier_static.bai_tap;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {

    };

    public Circle(double radius) {
        this.radius = radius;
    }
    public void getRadius() {
        System.out.println("Radius is: "+radius);
    }
    public void getArea() {
        System.out.println("Area is: "+radius*radius*3.14);
    }
}
