package e20and21and22;

public class Cube extends Shape3D {

    private float edge;

    public Cube(float edge) {
        this.edge = edge;
    }

    @Override
    public float calculatePerimeter() {
        return 12 * edge;
    }

    @Override
    public float calculateArea() {
        return (float) (6*Math.pow(edge,2));
    }

    @Override
    public float calculateVolume() {
        return (float) Math.pow(edge,3);
    }

    @Override
    public void fill(float ink) {
        if(ink<calculateVolume()){
            System.out.println("The cube is not filled. Pour some more!");
        } else if(ink > calculateVolume()){
            System.out.println("Oh no, the cube is overflowing!");
        } else{
            System.out.println("The cube is filled. Perfect!");
        }
    }
}
