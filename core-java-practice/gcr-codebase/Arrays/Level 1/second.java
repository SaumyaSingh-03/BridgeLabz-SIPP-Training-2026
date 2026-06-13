package arrays;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for(int i = 0; i<nums.length; i++) {
            System.out.println("Enter 5 numbers: ");
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i<nums.length; i++) {
            if(nums[i]>0) {
                if(nums[i]%2==0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else if(nums[i]==0) {
                System.out.println("Number is Zero");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
