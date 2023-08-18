import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws Exception{
        File file  = new File("in.txt");
        Scanner scanner = new Scanner(file);
        FileWriter fw = new FileWriter("out.txt");
        while (scanner.hasNext()){
//            System.out.println(scanner.nextLine());

            fw.write(scanner.nextLine()+"\n");

        }
        fw.close();
    }
}
