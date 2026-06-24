package OOPS;

public class Circle {
    double radius;
    final double pi = 3.141;

    public void Area() {
        System.out.println("Area of the Circle: " +pi*radius*radius);
    }

    public void Circumference() {
        System.out.println("Circumference of Circle: " +2*pi*radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 4.32;
        c.Area();
        c.Circumference();
    }
}
