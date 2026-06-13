package arrays;
import java.util.Scanner;

public class sumOfAllNumbers {
    public static void main(String[] args) {
        double[] nums = new double[10];
        double acc = 0.0;
        int idx = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number: ");
            double num = sc.nextDouble();

            if(num<=0) {
                break;
            }
            if(idx == 10){
                break;
            }

            nums[idx] = num;
            idx++;
        }

        for(int i = 0; i<idx; i++) {
            acc += nums[i];
        }

        System.out.println("Entered Number are: ");
        for(int i = 0; i<idx; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("Total sum: ");
        System.out.println(acc);
    }
}
