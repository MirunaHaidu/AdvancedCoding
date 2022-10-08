package e20and21and22;

public class Cone extends Shape3D{

    private float radius;
    private float height;


    public Cone(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float calculatePerimeter() { //can't have perimeter?
        return 0;
    }

    @Override
    public float calculateArea() { //total surface area
        return (float) (Math.PI * radius*slantHeight() + Math.PI*Math.pow(radius, 2));
    }

    @Override
    public float calculateVolume() {
        return (float) ((1/3f)*Math.PI*Math.pow(radius,2)*height);
    }

    public float slantHeight(){
        return (float) Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
    }

    @Override
    public void fill(float ink) {
        if(ink<calculateVolume()){
            System.out.println("The cone is not filled. Pour some more!");
        } else if(ink > calculateVolume()){
            System.out.println("Oh no, the cone is overflowing!");
        } else{
            System.out.println("The cone is filled. Perfect!");
        }
    }
}
