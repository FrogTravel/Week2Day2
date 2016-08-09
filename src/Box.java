/**
 * Created by ekaterina on 09.08.16.
 */
public class Box extends Figure {

    private double a,b,c;

    public Box(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 2*a*b+2*b*c+2*c*a;
    }
}
