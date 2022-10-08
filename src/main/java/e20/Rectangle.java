package e20;

public class Rectangle extends Shape{

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculatePerimeter() {
        return 2*length +2*width;
    }

    @Override
    public float calculateArea() {
        return length * width;
    }
}
