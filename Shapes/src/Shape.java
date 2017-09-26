import java.util.Scanner;

public abstract class Shape {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        int width = in.nextInt();

        System.out.println("Enter heigth of rectangle: ");
        int height = in.nextInt();

        Rectangle f1 = new Rectangle(width, height);
        System.out.print("Created rectangle of shape: ");
        System.out.println("(" + f1.getWidth() + "; " + f1.getHeight() + ")");
        System.out.println("Area: " + f1.calculateArea());

        System.out.println("Enter wigth of square: ");
        int width_s = in.nextInt();

        Square f2 = new Square(width_s);
        System.out.print("Created square of shape: ");
        System.out.println(f2.getWidth());
        System.out.println("Area: " + f2.calculateArea());

        System.out.println("Enter radius of circle: ");
        int radius = in.nextInt();

        Circle f3 = new Circle(radius);
        System.out.print("Created circle of shape: ");
        System.out.println(f3.getRadius());
        System.out.println("Area: " + f3.calculateArea());
    }

    abstract double calculateArea();
}
