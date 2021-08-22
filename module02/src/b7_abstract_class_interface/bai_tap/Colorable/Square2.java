package b7_abstract_class_interface.bai_tap.Colorable;

import b7_abstract_class_interface.bai_tap.Colorable.Colorable;
import b7_abstract_class_interface.bai_tap.Colorable.Shape2;

public class Square2 extends Shape2 implements Colorable {
    double width;

    public Square2(double width) {
        this.width = width;
    }

    public double getAre() {
        return width * width;
    }
    public double getArea() {
        return width * width;
    }
    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
