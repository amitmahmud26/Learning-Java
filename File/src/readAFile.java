import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readAFile {
    public static void main(String[] args) {
        String id = null, name = " ";
        try {
            File file = new File("person/students.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                id = scanner.next();
                name = scanner.next();

//                System.out.println("ID: "+id+" "+"Name: "+name);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}
