package programmingelements;
import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm =
                0.5 * base * height;

        double areaInch =
                areaCm / (2.54 * 2.54);

        System.out.println("Area in sq cm = "
                + areaCm);
        System.out.println("Area in sq inch = "
                + areaInch);
    }
}
