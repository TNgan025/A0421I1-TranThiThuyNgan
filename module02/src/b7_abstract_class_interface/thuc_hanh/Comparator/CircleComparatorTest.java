package b7_abstract_class_interface.thuc_hanh.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
        public static void main(String[] args) {
            b6_inheritance.thuc_hanh.Circle.Circle[] circles = new b6_inheritance.thuc_hanh.Circle.Circle[3];
            circles[0] = new b6_inheritance.thuc_hanh.Circle.Circle(3.6);
            circles[1] = new b6_inheritance.thuc_hanh.Circle.Circle();
            circles[2] = new b6_inheritance.thuc_hanh.Circle.Circle(3.5, "indigo", false);

            System.out.println("Pre-sorted:");
            for (b6_inheritance.thuc_hanh.Circle.Circle circle : circles) {
                System.out.println(circle);
            }

            Comparator circleComparator = new CircleComparator();
            Arrays.sort(circles, circleComparator);

            System.out.println("After-sorted:");
            for (b6_inheritance.thuc_hanh.Circle.Circle circle : circles) {
                System.out.println(circle);
            }
        }
}
