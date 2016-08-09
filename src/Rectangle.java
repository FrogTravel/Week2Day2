/**
 * Created by ekaterina on 09.08.16.
 */
public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double area(){
        return a*b;
    }
}
