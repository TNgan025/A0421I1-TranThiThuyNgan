package b2_loop_in_java.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        } else if (a == 0 || b==0) {
            System.out.println("Greatest common factor is " +(a+b));
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
                }
            System.out.println("Greatest common factor: " + a);
            }
        }
    }