package arrays;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number;
        }
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        int idx = count - 1;

        while (temp != 0) {
            digits[idx] = temp % 10;
            temp /= 10;
            idx--;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.println("Reversed Digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i] + " ");
        }
        sc.close();
    }
}