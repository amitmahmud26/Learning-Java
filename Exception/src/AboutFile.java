import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AboutFile {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        File fw = new File("file1.txt");
        Scanner myReader = new Scanner(fw);
        FileWriter writer = new FileWriter("file2.txt", true);
        while(myReader.hasNext()){
            String line = myReader.nextLine();
            writer.write(line+"\n");
            System.out.println(line);
        }
        writer.close();


//        FileWriter writer = new FileWriter("file2.txt", true);
//        writer.write("Horny amit with mawlana bhai!\n");
//        writer.close();
    }
}


//File
// FileWriter