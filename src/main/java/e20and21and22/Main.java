package e20and21and22;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,7);
        Triangle triangle = new Triangle(10,14,22);
        Hexagon hexagon = new Hexagon(10);
        Cone cone = new Cone(30,25);
        Cube cube = new Cube(10);

        System.out.println("-----RECTANGLE------");
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("-----TRIANGLE------");

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println("-----HEXAGON------");

        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());
        System.out.println("-----CONE------");

        System.out.println(cone.calculateArea());
        System.out.println(cone.calculateVolume());
        System.out.println("-----CUBE------");

        System.out.println(cube.calculateArea());
        System.out.println(cube.calculatePerimeter());
        System.out.println(cube.calculateVolume());

        System.out.println("-------------------------");
        cube.fill(1001);
        cone.fill(500);
        cone.fill(23561.945f);




    }
}
