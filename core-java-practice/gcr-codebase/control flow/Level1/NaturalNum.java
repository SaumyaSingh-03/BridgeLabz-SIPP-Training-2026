package controlFlow;
import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n>=1) {
            n = n*(n+1)/2;
            System.out.println("The sum of natural number is: " + n);
        } else {
            System.out.println("Not a natural Number");
        }

        sc.close();
    }
}
