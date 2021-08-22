package b7_abstract_class_interface.bai_tap.Resizeable;

public class Square extends Shape implements Resizeable {
    double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea(double width) {
        return width * width;
    }
    public double resize(double percent) {
        return getArea(width*(1+percent/100));
    }

    @Override
    public double getArea() {
        return width * width;
    }


//    @Override
//    public double getArea() {
//            return width * width;
//    }
}
