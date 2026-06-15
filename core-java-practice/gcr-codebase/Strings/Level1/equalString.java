package string;
import java.util.Scanner;

public class equalString {

    public static boolean checkEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }

        for(int i = 0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        boolean charAtResult = checkEqual(s1, s2);
        boolean equalResult = s1.equals(s2);

        System.out.println("Using charAt(): " + charAtResult);
        System.out.println("Using equals(): " + equalResult);

        if (charAtResult == equalResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();

    }
}
