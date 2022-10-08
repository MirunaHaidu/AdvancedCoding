package e20;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,7);
        Triangle triangle = new Triangle(10,14,22);
        Hexagon hexagon = new Hexagon(10);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());


    }
}
