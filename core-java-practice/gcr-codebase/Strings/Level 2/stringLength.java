package string;
import java.util.Scanner;

public class stringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}