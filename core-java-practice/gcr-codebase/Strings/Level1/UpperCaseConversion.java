package Strings;
import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            userUpper += ch;
        }

        String builtInUpper = text.toUpperCase();

        boolean isEqual = true;

        if (userUpper.length() != builtInUpper.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < userUpper.length(); i++) {
                if (userUpper.charAt(i) != builtInUpper.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("User-defined Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Equal? " + isEqual);

        sc.close();
    }
}