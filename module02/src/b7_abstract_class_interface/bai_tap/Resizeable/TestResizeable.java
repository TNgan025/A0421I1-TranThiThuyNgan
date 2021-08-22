package b7_abstract_class_interface.bai_tap.Resizeable;

public class TestResizeable {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        System.out.println(circle1.resize(20));
        Rectangle rectangle = new Rectangle(1,7);
        System.out.println(rectangle.resize(70));
        Square square1 = new Square(3);
        System.out.println(square1.resize(50));


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 7);
        shapes[2] = new Square(5);

        for (int i = 0; i < 3; i++) {
            System.out.println("Area is: " + shapes[i].getArea());
            System.out.println("New area is: " + shapes[i].resize(Math.random()*100));
        }
    }
}