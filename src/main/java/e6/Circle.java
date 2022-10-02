package e6;

import java.util.List;

public class Circle implements Movable, Resizable {
    Point2D center;
    Point2D pointer;

    public Circle(Point2D center, Point2D pointer) {
        this.center = center;
        this.pointer = pointer;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((pointer.getY() - center.getY()), 2) +
                Math.pow((pointer.getX() - center.getX()), 2));
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    public double getArea() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }

    public List<Point2D> getSlicePoints() {
        return List.of(new Point2D(pointer.getX(), -1 * pointer.getY()),
                new Point2D(-1 * pointer.getX(), -1 * pointer.getY()),
                new Point2D(-1 * pointer.getY(), pointer.getY()));
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        pointer.move(new MoveDirection(pointer.getX() + moveDirection.getX(),
                pointer.getY() + moveDirection.getY()));
    }

    @Override
    public void resize(double resizeFactor) {
        pointer.move(new MoveDirection(pointer.getX() * resizeFactor, pointer.getY() * resizeFactor));
    }
}
