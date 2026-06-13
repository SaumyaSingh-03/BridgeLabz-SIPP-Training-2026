package arrays;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();

        if(n<=0) {
            System.out.println("Not a natural Number!");
            return;
        }

        int size = n/(2+1);
        int[] odd = new int[size];
        int[] even = new int[size];

        int oddIdx = 0;
        int evenIdx = 0;

        for(int i = 1; i<=n; i++) {
            if(i%2 == 0) {
                even[evenIdx] = i;
                evenIdx++;
            } else {
                odd[oddIdx] = i;
                oddIdx++;
            }
        }
        System.out.println("Odd Numbers are: ");
        for(int i = 0; i<oddIdx; i++) {
            System.out.println(odd[i] + " ");
        }

        System.out.println("Even Numbers are: ");
        for(int i = 0; i<evenIdx; i++) {
            System.out.println(even[i] + " ");
        }
        sc.close();
    }
}
