package arrays;
import java.util.Scanner;
public class largestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;

        while (number != 0) {
            int digit = number % 10;

            digits[idx] = digit;
            idx++;

            if (idx == maxDigit) {
                break;
            }

            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}