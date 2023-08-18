import java.io.File;
import java.util.*;

import javax.swing.JFrame;

public class Main{

    public static void main (String[] args) {

        File file1, file2;
        file1 = new File("person/Student.txt");
        file2 = new File("person/Teacher.txt");
        try {
            file1.createNewFile();
            System.out.println("You created a file called Student.txt");
            file2.createNewFile();
            System.out.println("You created a file called Teacher.txt");
        } catch (Exception e) {
            System.out.println("You got an error");
        }
        String path = file1.getPath();
        System.out.println(path);
    }
}