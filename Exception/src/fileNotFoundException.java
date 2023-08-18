import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileNotFoundException {
    public static void main(String[] args) {
        File file = new File("test.txt");
        String input = "";
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            input = scanner.nextLine();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println(input);
    }
}
