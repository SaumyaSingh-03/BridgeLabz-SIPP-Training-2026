package Strings;
import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.next();

        char[] CharArray1 = new char[text.length()];

        for(int i = 0; i<text.length(); i++) {
            CharArray1[i] = text.charAt(i);
        }

        char[] CharArray2 = text.toCharArray();

        boolean isEqual = true;

        if (CharArray1.length != CharArray2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < CharArray1.length; i++) {
                if (CharArray1[i] != CharArray2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.print("User-defined array: ");
        for (int i = 0; i < CharArray1.length; i++) {
            System.out.print(CharArray2[i] + " ");
        }

        System.out.println();

        System.out.print("Built-in array: ");
        for (int i = 0; i < CharArray2.length; i++) {
            System.out.print(CharArray2[i] + " ");
        }

        System.out.println();
        System.out.println("Are both arrays equal? " + isEqual);

        sc.close();
    }
}
