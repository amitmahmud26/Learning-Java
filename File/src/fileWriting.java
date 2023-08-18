import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class fileWriting {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("file data");
            fw.close();
        }
        catch (Exception e){

        }
    }
}
