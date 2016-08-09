/**
 * Created by ekaterina on 09.08.16.
 */
public class Sphere extends Figure {
    double r;
    public Sphere(double r){
        this.r = r;
    }


    @Override
    public double area() {
        return (4/3)*Math.PI*r*r*r;
    }
}
