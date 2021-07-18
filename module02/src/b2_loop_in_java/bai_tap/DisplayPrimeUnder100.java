package b2_loop_in_java.bai_tap;

public class DisplayPrimeUnder100 {
    public static void main(String[] args) {

        int n=2;
        while(n<100) {
            boolean check = true;
            for (int i=2;i<=n/2;i++) {
                if (n % i == 0) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println("Prime number is smaller than 100 is "+n);
            }
            n++;
        }
    }
}

