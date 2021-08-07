package b6_inheritance.thuc_hanh.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Shape circle4 = new Circle();
        System.out.println(circle4.getColor());
    }
}
