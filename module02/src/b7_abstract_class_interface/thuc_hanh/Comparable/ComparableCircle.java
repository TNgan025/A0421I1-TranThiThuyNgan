package b7_abstract_class_interface.thuc_hanh.Comparable;

public class ComparableCircle extends b6_inheritance.thuc_hanh.Circle.Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {}
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
