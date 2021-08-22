package b7_abstract_class_interface.thuc_hanh.Comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<b6_inheritance.thuc_hanh.Circle.Circle> {
    public int compare(b6_inheritance.thuc_hanh.Circle.Circle c1, b6_inheritance.thuc_hanh.Circle.Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
