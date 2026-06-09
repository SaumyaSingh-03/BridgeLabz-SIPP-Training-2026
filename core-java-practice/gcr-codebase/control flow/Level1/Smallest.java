package controlFlow;
import java.util.*;

public class Smallest {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1<n2 && n1<n3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
