package b7_abstract_class_interface.bai_tap.Colorable;

import b7_abstract_class_interface.bai_tap.Colorable.Circle2;
import b7_abstract_class_interface.bai_tap.Colorable.Shape2;
import b7_abstract_class_interface.bai_tap.Colorable.Rectangle2;
import b7_abstract_class_interface.bai_tap.Colorable.Square2;
public class TestColorable {
    public static void main(String[] args) {
        double width;
        Square2 square = new Square2(2);
        System.out.println(square.howToColor());
        Shape2[] shape2s = new Shape2[3];
        shape2s[0] = new Circle2(2);
        shape2s[1] = new Rectangle2(5,10);
        shape2s[2] = new Square2(5);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area is: " + shape2s[i].getArea());

        }
    }

}
