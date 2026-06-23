package Strings;
import java.util.Scanner;

public class SubstringOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.next();

        System.out.println("Enter start index: ");
        int start = sc.nextInt();

        System.out.println("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = "";
        for(int i = start; i<end; i++) {
            sub1 += text.charAt(i);
        }

        String sub2 = text.substring(start, end);

        boolean isEqual = true;

        if(sub1.length() != sub2.length()) {
            isEqual = false;
        } else {
            for(int i = 0; i<sub1.length(); i++) {
                if(sub1.charAt(i) != sub2.charAt(i)) {
                    isEqual = false;
                }
            }
        }

        System.out.println("Substring using CharAt(i): " +sub1);
        System.out.println("Substring using substring(): " +sub2);
        System.out.println("Both Equal? " +isEqual);

        sc.close();
    }
}
