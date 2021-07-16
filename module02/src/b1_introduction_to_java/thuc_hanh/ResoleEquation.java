import java.util.Scanner;

public class ResoleEquation {

    public static void main(String[] args) {
        System.out.println("Linear Equation resolver");
        System.out.println("Given an equation as 'a*x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a= ");
        double a=scanner.nextDouble();
        System.out.println("b= ");
        double b=scanner.nextDouble();
        System.out.println("c= ");
        double c=scanner.nextDouble();
if(a==0) {
    System.out.println("The equation has no sollution");
} else if(b==c) {
    System.out.println("The sollution is all x ");
} else {
    System.out.println("The sollution is: "+((c-b)/a));
}

    }
}
