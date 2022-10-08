package e20and21and22;

public class Hexagon extends Shape {

    private float side;

    public Hexagon(float side) {
        this.side = side;
    }

    @Override
    public float calculatePerimeter() {
        return 6 * side;
    }

    @Override
    public float calculateArea() {
        return (float) ((3 * Math.sqrt(3) * Math.pow(side, 2)) / 2);
    }
}
