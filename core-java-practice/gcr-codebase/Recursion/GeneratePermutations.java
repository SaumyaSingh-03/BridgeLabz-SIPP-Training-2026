package Recursion;
import java.util.Scanner;

public class GeneratePermutations {

    static void generate(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String remaining =
                    str.substring(0, i)
                            + str.substring(i + 1);

            generate(remaining, ans + current);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        generate(str, "");
    }
}