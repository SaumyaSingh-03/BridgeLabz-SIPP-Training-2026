package arrays;
import java.util.Scanner;

public class meanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;

        for(int i = 0; i<heights.length; i++) {
            System.out.println("Enter height: ");
            heights[i] = sc.nextDouble();
        }

        for(int i = 0; i<heights.length; i++) {
            sum += heights[i];
        }
        double meanHeight = sum/11;

        System.out.println("The mean height is: " +meanHeight);
    }
}
