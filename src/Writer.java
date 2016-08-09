import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author ekaterina
 */
public class Writer {
    PrintWriter printWriter;


    /**
     * Constructor that makes new PrintWriter object using given name
     * @param filename
     */
    public Writer(String filename){
        try {
            printWriter = new PrintWriter(filename, "ascii");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * Writes file
     * @param s
     */
    public void write(String s){
        printWriter.print(s);
    }


    /**
     * Close write "thread"
     */
    public void close(){
        printWriter.close();
    }

}
