package e20;

import java.util.Map;

public class Triangle extends Shape {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public float calculateArea() {
        float semiPerimeter = calculatePerimeter()/2;
        return (float) Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    }
}
