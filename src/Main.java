
/**
 * @author ekaterina
 */
public class Main {
    String shape = "";
    Figure figure;


    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }

    /**
     * Makes new reader and writer for reading input.txt file and
     * write output.txt file
     * Reads all lines in file
     * Parse sentence
     * Takes shape, switch through
     */
    public void go(){
        String str = "";
        double[] params = new double[3];//3 - max params
        String result = "";

        Reader reader = new Reader("input.txt");
        Writer writer = new Writer("output.txt");
        while((str = reader.nextLine()) != null){
            String[] strArr = str.split(" ");
            shape = strArr[0];

            for(int i = 1; i < strArr.length; i++){
                params[i-1] = Double.parseDouble(strArr[i]);
            }

            countArea(shape, params);
            result += (shape + " " + figure.area() + "\n");
        }
        writer.write(result);
        writer.close();
    }

    public void countArea(String shape, double[] params){
        switch (shape){
            case "Rectangle":
                figure = new Rectangle(params[0], params[1]);
                break;
            case "Box":
                figure = new Box(params[0], params[1], params[2]);
                break;
            case "Circle":
                figure = new Circle(params[0]);
                break;
            case "Sphere":
                figure = new Sphere(params[0]);
                break;
            case "Ellipse":
                figure = new Ellipse(params[0], params[1]);
                break;
            case "Square":
                figure = new Square(params[0]);
                break;
        }
    }
}
