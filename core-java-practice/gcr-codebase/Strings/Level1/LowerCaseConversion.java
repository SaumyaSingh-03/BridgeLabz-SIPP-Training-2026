package Strings;
import java.util.Scanner;

public class LowerCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            userLower += ch;
        }

        String builtInLower = text.toLowerCase();

        boolean isEqual = true;

        if (userLower.length() != builtInLower.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < userLower.length(); i++) {
                if (userLower.charAt(i) != builtInLower.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("User-defined Lowercase: " + userLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Equal? " + isEqual);

        sc.close();
    }
}