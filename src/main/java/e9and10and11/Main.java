package e9and10and11;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(0,0);
        Point2D point2D1 = new Point2D(3,6);

        Circle circle = new Circle(point2D,point2D1);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());
        System.out.println(circle.getSlicePoints());
        System.out.println("----------------------------------");


        circle.move(new MoveDirection(3,3));
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());
        System.out.println(circle.getSlicePoints());
        System.out.println("----------------------------------");


        circle.resize(2.0f);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());
        System.out.println(circle.getSlicePoints());
    }
}
