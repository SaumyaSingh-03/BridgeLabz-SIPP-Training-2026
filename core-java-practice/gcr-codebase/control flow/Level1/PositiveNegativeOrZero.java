package controlFlow;
import java.util.*;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n>=1) {
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
