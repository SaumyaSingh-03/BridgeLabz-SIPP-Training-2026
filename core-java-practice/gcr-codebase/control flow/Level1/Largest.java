package controlFlow;
import java.util.*;

public class Largest {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1>n2 && n1>n3) {
            System.out.println("First is the largest of three");
        } else if (n2>n1 && n2>n3) {
            System.out.println("Second is the largest of the three");
        } else {
            System.out.println("Third is the largest of the three");
        }

        sc.close();
    }
}
