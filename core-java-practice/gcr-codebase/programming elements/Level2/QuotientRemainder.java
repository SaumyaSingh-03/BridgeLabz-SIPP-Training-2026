package programmingelements;
import java.util.* ;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("Quotient = "
                + quotient);
        System.out.println("Remainder = "
                + remainder);
    }
}
