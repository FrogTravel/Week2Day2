
/**
 * Created by ekaterina on 09.08.16.
 */
public class Ellipse extends Figure {
    private double r1;
    private double r2;

    public Ellipse(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double area(){
        return Math.PI*r1*r2;
    }
}
