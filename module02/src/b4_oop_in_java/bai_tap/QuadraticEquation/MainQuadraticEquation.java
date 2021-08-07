package b4_oop_in_java.bai_tap;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        equation1.setA(scanner.nextDouble());
        System.out.println("Enter b");
        equation1.setB(scanner.nextDouble());
        System.out.println("Enter c");
        equation1.setC(scanner.nextDouble());
        if (equation1.getDiscriminant() > 0) {
            System.out.println("The Equation has two roots: "+equation1.getRoot1() +" and "+equation1.getRoot2());
        } else if(equation1.getDiscriminant() == 0) {
            System.out.println("The Equation has one root" + equation1.getRoot1());
        } else {
            System.out.println("The Equation has no root");
        }
    }
}
