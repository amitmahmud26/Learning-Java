import java.io.File;
import java.util.Formatter;

public class enterInputInFIle {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("person/Teacher.txt");
            formatter.format("%s,%s\n","101","Sabbir");

            formatter.close();
        }
        catch (Exception e){
            System.out.println("File not found");
        }

    }
}
